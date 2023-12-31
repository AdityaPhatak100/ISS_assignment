package filereadwrite;

import java.io.FileWriter;
import java.io.IOException;

public class WriteExample {
	public static void main(String[] args) throws IOException {

		String str = "Implementation of a FileReader!";

		FileWriter fw = new FileWriter("file-writer-output.txt");

		for (int i = 0; i < str.length(); i++)
			fw.write(str.charAt(i));

		fw.close();
	}
}