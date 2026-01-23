package classjava9Filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderSample {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new FileReader("f:/example.txt"));
		String line;
		while ((line=br.readLine())!=null)
		{
			System.out.println(line);
		}

		br.close();
	}

}
