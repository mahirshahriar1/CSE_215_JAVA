import java.util.Scanner;

public class quadratic_roots {
	public static void main(String[] args)
	{
		double a,b,c,root1 = 0, root2=0, determinant;
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the coefficients:");
		System.out.print("a: ");
		 a=input.nextDouble();
		System.out.print("b: ");
		 b=input.nextDouble();
		System.out.print("c: ");
		 c=input.nextDouble();
		
		input.close();	
		
		//System.out.printf("%f %f %f\n", a,b,c);
		//System.out.println(""+a+ " "+b+ " "+c);
				
		determinant=b*b-4*a*c;

		if(determinant>=0)
		{
			root1=(-b+Math.sqrt(determinant))/(2*a);
			root2=(-b-Math.sqrt(determinant))/(2*a);
			System.out.format("Root 1 : %.2f\n", root1);
			System.out.format("Root 2 : %.2f ", root2);
		}
		
		else if(determinant<0)
		{
			root1=-b/(2*a);
			root2=-b/(2*a);
			determinant=Math.sqrt(-determinant)/(2*a);
			System.out.format("Root 1 : %.2f+%.2fi\n", root1, determinant);
			System.out.format("Root 2 : %.2f-%.2fi", root2, determinant);
		}	
						
		
	}
}
