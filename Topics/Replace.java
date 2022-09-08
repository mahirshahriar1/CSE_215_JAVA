import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	//Scanner scanner = null;
    try (Scanner scanner = new Scanner(new File("filename"))){
        boolean outfile_open = false;
        try (PrintWriter output = new PrintWriter(new File("filename_out"))) {
            String input;
            while (scanner.hasNext()) {
                input = scanner.nextLine();
                System.out.println(input);
                //String outStr = input.replace("target", "replace");
                System.out.println(outStr);
                output.println(outStr);
            }
        } catch (FileNotFoundException o) {
        
            
        }
        
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } 

	}
}
