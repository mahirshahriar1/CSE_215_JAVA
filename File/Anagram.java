package com.mahir;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Task {
	
	public boolean isAnagram(String word1, String word2)
	{
		char[] arr1= word1.toCharArray();
		char[] arr2= word2.toCharArray();

		Arrays.sort(arr1);
		Arrays.sort(arr2);
		if(Arrays.equals(arr1, arr2))
			return true;
		else			
			return false;
	}

	public static void main(String[] args) {
		
		File file1= new File("input.txt");
		File file2=new File("output.txt");
		
		Task c=new Task();
		
		try {
			if(!file2.createNewFile())
				System.out.println("output.txt already exists, file will  be overwritten");
			else
				System.out.println("an output file created successfully");
		}catch(IOException e)
		{
			e.printStackTrace();
		}
	
		try {
			Scanner reader=new Scanner(file1);
			FileWriter writer=new FileWriter(file2);
			while(reader.hasNextLine())
			{
				String w1=reader.next();
				String w2=reader.next();
				
				if(c.isAnagram(w1,w2))
					writer.write(w1+" "+w2+"\n");	
		
			}
			reader.close();
			writer.close();

		}catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		/*try {
			FileReader file=new FileReader(file1);
			BufferedReader br=new BufferedReader(file);
			FileWriter writer=new FileWriter(file2);
			String input;
			while((input=br.readLine())!=null)
			{
				
				String[] arrOfStr= input.split(" ");
				String w1=arrOfStr[0];
				String w2=arrOfStr[1];				
				
				if(c.isAnagram(w1,w2))
					writer.write(w1+" "+w2+"\n");				
			
			}
			br.close();
			writer.close();

		}catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}catch(IOException e)
		{
			e.printStackTrace();
		}*/

	}

}
