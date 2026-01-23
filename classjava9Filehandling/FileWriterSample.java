package classjava9Filehandling;

import java.io.FileWriter;
import java.io.IOException;


public class FileWriterSample {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("F:/example.txt");
			fw.write("Hello Java File Handling");
			fw.close();
			System.out.println("File Written Successfully");
		}
		catch(IOException e) {
			System.out.println(e);
		}

	}

}
