import java.util.Scanner;

public class Task2 {

	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int x=input.nextInt();
		
		System.out.println("Sum of digits: "+(sumDigit(x)));
		input.close();
		
	}
	
	public static int sumDigit(int y)
	{
		int z=0;
		while(y>0)
		{
			z+=y%10;
			y/=10;
		}
		return z;
	}
}
