import java.util.*;

public class Method_constant_vowel_summation {
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		String first_name=input.next();	
		String last_name=input.next();
		int sum=specialFunction(first_name.toLowerCase(),last_name.toLowerCase());
		System.out.println(sum);
		input.close();
	}
	public static int specialFunction(String name1,String name2)
	{
		int summation=0;
		for(int i=0;i<name1.length();i++)
		{
			if(name1.charAt(i)!='a'&&name1.charAt(i)!='e'
					&&name1.charAt(i)!='i'&&name1.charAt(i)!='o'
					&&name1.charAt(i)!='u')
			summation++;
		}
		for(int i=0;i<name2.length();i++)
		{
			if(name2.charAt(i)=='a'||name2.charAt(i)=='e'
					||name2.charAt(i)=='i'||name2.charAt(i)=='o'
					||name2.charAt(i)=='u')
			summation++;
		
		}
		return summation;
	}
}
