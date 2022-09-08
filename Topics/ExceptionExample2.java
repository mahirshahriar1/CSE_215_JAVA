import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;


public class ExceptionExample2 {
  
   public static void main(String args[]) {
      String filename = "E:\\test.txt";
      File file = new File(filename);
      try {
          System.out.println("Trying to open file");
          FileReader fr = new FileReader(file); 
          System.out.println("Sucessfully opened file");
      } catch (FileNotFoundException ex) {
          System.out.println("File " + filename + " not found");
      }
      
   }
}