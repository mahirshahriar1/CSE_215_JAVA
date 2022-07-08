package com.taskss;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class task5 {
	
	public boolean isPrime(int num)
	{
		if(num==1)
			return false;
		for(int i=2;i*i<=num;i++)
		{
			if(num%i==0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		File fileobj=new File("src/task5_input.txt");
		
		ArrayList<Integer> arr=new ArrayList<Integer>();
		
		task5 c=new task5();
		
		try {
			Scanner reader=new Scanner(fileobj);
			while(reader.hasNext())
			{
				int x=Integer.parseInt(reader.next());
				if(c.isPrime(x))
				{
					arr.add(x);
				}						
				
			}			
			reader.close();
			
		}catch(IOException e) {
			System.out.println("Error");
			e.printStackTrace();
		}
		
		int sum=0;
		for(int x:arr)
		{
			sum+=x;
		}
		
		System.out.println(sum);
		
	}

}
