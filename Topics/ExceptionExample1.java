import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.*;

public class ExceptionExample1 {
  
   public static void main(String args[]) {
      Scanner in = new Scanner(System.in);
      System.out.println("Please enter a filename to read");
      String filename = in.nextLine();
    
      File file = new File(filename);
      System.out.println("Trying to open file");
      FileReader fr = new FileReader(file); 
      System.out.println("Sucessfully opened file");
 
   }
}