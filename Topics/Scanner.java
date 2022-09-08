import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner scanner = null;
    try {
        scanner = new Scanner(new File("scores.txt"));
        while (scanner.hasNext()) {
            System.out.println(scanner.nextLine());
        }
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } finally {
        if (scanner != null) {
            scanner.close();
        }
	}

	}
}
