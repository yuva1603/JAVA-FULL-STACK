package classjava9Filehandling;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderSample {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("f:/example.txt");
		int ch;
		while((ch = fr.read())!=-1)
		{
			System.out.print((char)ch);
		}
		fr.close();
	}

}
