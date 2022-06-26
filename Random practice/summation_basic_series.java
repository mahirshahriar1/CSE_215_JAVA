
import java.util.Scanner;

public class num2 {

	public static void main(String[] args) {
			Scanner input=new Scanner(System.in);
			
			double n,sum=0;
			System.out.print("N = ");
			n=input.nextDouble();
			
			for(int i=1;i<=n;i++)
					sum+=1.0/i;
			
			System.out.printf("Summaion = %.2f", sum);
			
			input.close();

	}

}
