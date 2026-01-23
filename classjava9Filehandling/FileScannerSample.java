package classjava9Filehandling;

import java.io.File;

import java.util.Scanner;

public class FileScannerSample {

	public static void main(String[] args) throws Exception {
		
			File file=new File("f:/example.txt");
			Scanner sc=new Scanner(file);
			
			while(sc.hasNextLine())
			{
				System.out.println(sc.nextLine());
			}
			sc.close();
			
		}

	}


