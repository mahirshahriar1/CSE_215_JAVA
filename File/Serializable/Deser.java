import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deser {

	public static void main(String[] args) {
		File file = new File("Employee.ser");

		FileInputStream fis = null;
		ObjectInputStream ois = null;

		try {

			fis = new FileInputStream(file);
			ois = new ObjectInputStream(fis);

			Employee[] employee = new Employee[3];
			boolean endOfFile=false;
			int j=0;
			while(!endOfFile)		
			{				
				try {					
					employee[j++] = (Employee)ois.readObject();
		
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}catch(EOFException x) {
					endOfFile=true;			
				}

			}
			System.out.println(employee.length);
			for (int i = 0; i < employee.length; i++) {
				System.out.println("Name: " + employee[i].getName());
				System.out.println("ID: " + employee[i].getId());
				System.out.println();
			}


			System.out.println("Deserialization done successfully!!");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				fis.close();
				ois.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
