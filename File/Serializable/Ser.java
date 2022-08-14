import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Ser {

	public static void main(String[] args) {
		File file = new File("Employee.ser");
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;

		try {
			Scanner scan = new Scanner(System.in);

			fos = new FileOutputStream(file);
			oos = new ObjectOutputStream(fos);

			Employee[] emp = new Employee[3];

			for (int i = 0; i < 3; i++) {
				System.out.print("Enter Name of Employee " + (i + 1) + ": ");
				String name = scan.nextLine();
				System.out.print("Enter ID of Employee " + (i + 1) + ": ");
				int id = scan.nextInt();
				emp[i] = new Employee(name, id);
				scan.nextLine();
				oos.writeObject(emp[i]);
			}
			scan.close();
			
			System.out.println("Serialization done successfully!!");
			System.out.println();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
				oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}

/*public class Ser {

	public static void main(String[] args) {
		File file = new File("Employee.ser");
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;

		try {
			Scanner scan = new Scanner(System.in);

			fos = new FileOutputStream(file);
			oos = new ObjectOutputStream(fos);

			Employee[] emp = new Employee[3];

			for (int i = 0; i < 3; i++) {
				System.out.print("Enter Name of Employee " + (i + 1) + ": ");
				String name = scan.nextLine();
				System.out.print("Enter ID of Employee " + (i + 1) + ": ");
				int id = scan.nextInt();
				emp[i] = new Employee(name, id);
				scan.nextLine();
			}
			scan.close();
			oos.writeObject(emp);
			System.out.println("Serialization done successfully!!");
			System.out.println();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
				oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
