package classjava9Filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterSample {

	public static void main(String[] args) throws IOException {
		BufferedWriter bw=new BufferedWriter(new FileWriter("f:/example.txt"));
		bw.write("Hello Java");
		bw.newLine();
		bw.write("BufferedWriter Example");
		bw.close();
		System.out.println("Data Written Successfully");
		
	}

}
 