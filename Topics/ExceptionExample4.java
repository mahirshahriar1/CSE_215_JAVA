import java.util.*;

public class ExceptionExample4 {
   
   public static void main(String args[]) {
      String[] alphabets = {"A", "B", "C", "D"};
	  Scanner input = new Scanner(System.in);
	  int index = input.nextInt();
      System.out.println(alphabets[index]);
   }
}