//in this program it will take inputs until zero/negative number is inserted. and print out the sum
import java.util.Scanner;

public class num3 {

	public static void main(String[] args) {
			Scanner input=new Scanner(System.in);
			
			double n=0,sum=0;
			System.out.print("Inputs : ");
							
			do{
				sum+=n;	
				n=input.nextDouble();
			}while(n>0);
			
			System.out.printf("Sum : %.2f", sum);
			
			input.close();

	}

}
