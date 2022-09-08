import java.io.*;

public class Main
{
	public static void main(String[] args) {
	    File file = new File("scores.txt");
        if (file.exists()) {
            System.out.println("File already exists");
            System.exit(0);
        }
        PrintWriter output = null;
        // Create a file
        try {
            output = new PrintWriter(file); 
        /* you can create PrintWriter objects for writing text to any file using print, println, and printf **/
        // Write formatted output to the file
           output.print("John T Smith ");
        output.println(90);
        output.print("Eric K Jones ");
        output.println(85);
        } catch (FileNotFoundException ex) {
            
        } finally {
        // Close the file
            if (output != null)
            output.close();
        }

	}
}
