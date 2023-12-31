package learningdb;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class JSONExample {
	public static void main(String[] args) {
		JSONObject student = new JSONObject();
		student.put("name", "Anay");
		student.put("math", 94);
		student.put("physics", 87);
		student.put("grade", "B+");

		String JSONText = JSONValue.toJSONString(student);

		System.out.println(JSONText);

	}
}
