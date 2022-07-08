package com.taskss;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class task6 {

	public static void main(String[] args) {
		File fileobj=new File("src/words.txt");
		
		ArrayList<String> arr=new ArrayList<String>();
		ArrayList<Integer> count=new ArrayList<Integer>();
		
		try {
			Scanner reader=new Scanner(fileobj);
			while(reader.hasNextLine())
			{
		
				String n=reader.nextLine();
				if(arr.contains(n))
				{
					int index=arr.indexOf(n);
					count.set(index, count.get(index)+1);
					
				}		
				else
				{
					arr.add(n);
					count.add(1);					
				}
					
			}
			
			reader.close();
		}catch(FileNotFoundException e)
		{
			System.out.println("File not found");
			e.printStackTrace();
		}
		
		File fileobj2=new File("src/output.txt");	
		int max=Collections.max(count);
		
		try {
			FileWriter writer=new FileWriter(fileobj2,false);
						
			for(int i=0;i<max;i++)		
			{
				for(int j=0;j<arr.size();j++)
				{
					if(count.get(j)==i)
					{
						System.out.println(arr.get(j)+"  "+count.get(j));
						writer.write(arr.get(j)+" "+Integer.toString(count.get(j))+'\n');
					}
						
				}
				
			}		
			writer.close();
			
		}catch(IOException e)
		{
			System.out.println("File already exists");
			e.printStackTrace();
		}	


	}

}
