package com.taskss;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class task4 {

	public static void main(String[] args) {
		File fileobj=new File("src/numbers.txt");
		
		ArrayList<Integer> arr=new ArrayList<Integer>();
		
		try {
			Scanner reader=new Scanner(fileobj);
			while(reader.hasNextLine())
			{
				boolean flag=true;
				
				int n=Integer.parseInt(reader.nextLine());
				if(arr.contains(n))
					flag=false;
		
				if(flag)
				{
					arr.add(n);
				}
					
			}
			
			reader.close();
		}catch(FileNotFoundException e)
		{
			System.out.println("File not found");
			e.printStackTrace();
		}
		
		int sum=0;
		//Collections.sort(arr, Collections.reverseOrder());
		//int index=arr.indexOf(9);
		
		
		for(int x:arr)
		{
			System.out.print(x+" ");
			sum=sum+x;
		}
		System.out.println("\n"+sum);
			
		

	}

}
