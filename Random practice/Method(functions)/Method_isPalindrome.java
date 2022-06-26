import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a string or number: ");
		String s=sc.nextLine();
		
		boolean result=ispalindrome(s);
		
		if(result)
			System.out.println(s+" is a palindrome");
		else
			System.out.println(s+" is not a palindrome");
		sc.close();

	}
	
	public static boolean ispalindrome(String input)
	{
		for(int i=0;i<input.length()/2;i++)
		{
			if(input.charAt(i)!=input.charAt(input.length()-1-i))
				return false;
		}
		return true;
	}

}
