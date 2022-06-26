import java.util.Scanner;

public class num1 {

	public static void main(String[] args) {
			Scanner input=new Scanner(System.in);
			
			int n,x=1,count=0;
			System.out.print("Enter N: ");
			n=input.nextInt();
			
			while(x<=n)
			{
				if(n%x==0)
					count++;
				x++;
			}
			
			System.out.println(n+" has total "+count+" factors.");
			
			input.close();

	}

}
