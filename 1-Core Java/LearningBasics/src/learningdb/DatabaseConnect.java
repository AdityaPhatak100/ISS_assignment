package learningdb;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnect {
	static final String DB_URL = "jdbc:mysql://localhost/student_data";
	static final String USER = "root";
	static final String PASS = "root";
	static final String QUERY = "SELECT * FROM students";

	public static void main(String[] args) {

		try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(QUERY);) {

			while (rs.next()) {
//				System.out.println(rs.getInt(1));
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getDate(4)
						+ " " + rs.getString(5) + " " + rs.getString(6));
			}

//			Callable Statement
			CallableStatement stmt2 = conn.prepareCall("{call ThreeCreditCourses()}");
			ResultSet rs2 = stmt2.executeQuery();

			while (rs2.next()) {
				System.out.println(
						rs2.getString(1) + " " + rs2.getString(2) + " " + rs2.getString(3) + " " + rs2.getString(4));
			}

//			Prepared Statement covered in user login application

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
