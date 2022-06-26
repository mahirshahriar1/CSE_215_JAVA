
import java.util.*;

public class Method_array_second_largest {


	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);

		System.out.print("Enter arary size: ");
		int n=input.nextInt();
		
		int [] arr=new int[n];
		
		for(int i=0;i<n;i++)
			arr[i]=input.nextInt();
		
		int seclarge=second_largest(arr);
		System.out.println(seclarge);
	
		input.close();

	}
	
	public static int second_largest(int array[])
	{
		Arrays.sort(array);
		
		return array[array.length-2];
	}	
	

}
