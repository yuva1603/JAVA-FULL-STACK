package classjava9Filehandling;

import java.io.File;
import java.io.IOException;

public class FileHandling1 {

	public static void main(String[] args) {
		try {
			File file= new File("F:/deleteExample.txt");
			
			if(file.createNewFile())
			{
				System.out.println("File Created");
			}
			else
			{
				System.out.println("File Already Exist");
			}
		}
		catch(IOException e)
		{
			System.out.println("Error Occured");
		}
	}

}
