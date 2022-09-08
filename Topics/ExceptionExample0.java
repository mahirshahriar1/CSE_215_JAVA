import java.util.*;

public class ExceptionExample0 {
  
   public static void main(String args[]) {
      Scanner in = new Scanner(System.in);
      System.out.println("Please enter number 1: ");
      int number1 = in.nextInt();
      System.out.println("Please enter number 2: ");
      int number2 = in.nextInt();
	  int div = number1/number2;
	  System.out.println("Division result = " + div);
    
      
   }
}