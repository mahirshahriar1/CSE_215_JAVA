import java.util.*;

public class ExceptionExample4_Sol {
   
   public static void main(String args[]) {
      String[] alphabets = {"A", "B", "C", "D"};
      System.out.print("Enter index as input: ");
	  Scanner input = new Scanner(System.in);
	  int index = input.nextInt();
	  try {
		System.out.println(alphabets[index]);
	  } catch (ArrayIndexOutOfBoundsException ex) {
		  System.out.println("Invalid Index " + index);
	  }
   }
}