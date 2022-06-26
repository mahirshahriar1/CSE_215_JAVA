package jj;

import java.util.Scanner;

public class Task1 {
	
	
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		String s;
		s=input.nextLine();
		s.toLowerCase();
		countVowels(s);
		
		System.out.println(countVowels(s));
				
		input.close();
	}
	
	public static int countVowels(String sentence)
	{
		int count=0;
		for(int i=0;i<sentence.length();i++)
		{
			if(sentence.charAt(i)=='a'
					||sentence.charAt(i)=='e'
					||sentence.charAt(i)=='i'||
					sentence.charAt(i)=='o'||
					sentence.charAt(i)=='u')
				count++;	
			
		}
		return count;
	}

	

}
