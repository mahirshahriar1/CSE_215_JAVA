package com.taskss;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class task3 {

	public static void main(String[] args) {
		File fileObj=new File("src/task3.txt");
		int n;
		System.out.println("Enter how many lines you want to read");
		Scanner input=new Scanner(System.in);
		n=input.nextInt();
		input.close();
		
		try {
			Scanner reader=new Scanner(fileObj);
			int count=0;
			while(reader.hasNextLine())
			{
				System.out.println(reader.nextLine());	
				count++;
				if(count==n)
					break;
			}
			if(count!=n)
				System.out.println(n-count+" lines were not printed as file ended");
			
			reader.close();			
			
		}catch(FileNotFoundException e)
		{
			System.out.println("File not found");
			e.printStackTrace();
		}

	}

}
