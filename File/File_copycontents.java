
package com.taskss;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {
		File fileObj=new File("src/task1_input.txt");
		File fileObj2=new File("src/task1_output.txt");
		
		try {
			Scanner reader=new Scanner(fileObj);
			FileWriter writer=new FileWriter(fileObj2);
			
			while(reader.hasNextLine())
			{
				writer.write(reader.nextLine()+'\n');
			}
			writer.close();
			reader.close();			
			
		}catch(FileNotFoundException e){
			System.out.println("File not found");
			e.printStackTrace();
		}catch(IOException e){
			System.out.println("File already exists");
			e.printStackTrace();
		}
		

	}

}
