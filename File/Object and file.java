package file;

public class Quiz {

	private String id;
	private int marks;
	public Quiz(String id, int marks) {
		this.id = id;
		this.marks = marks;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Quiz [id=" + id + ", marks=" + marks + "]";
	}
	
	
	
}



import java.io.File;
import java.util.Scanner;

public class Test {
	
	public static void main(String[] args)
	{
		Quiz[] arr=new Quiz[50];
		
		int ind=0;
		File file=new File("C:\\FINAL EXAM\\xyz\\src\\idmarks.txt");
		
		try {
			Scanner reader=new Scanner(file);
			while(reader.hasNextLine())
			{
				String temp1=reader.next();
				String temp2=reader.next();
				Quiz obj=new Quiz(temp1, Integer.parseInt(temp2));
				arr[ind++]=obj;
			}
			reader.close();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		String s="";
		int max=-50;
		for(int i=0;i<ind;i++)
		{			
			if(arr[i].getMarks()>max)
			{
				s=arr[i].getId();
				max=arr[i].getMarks();
			}
		}
		
		System.out.println(s+" "+max);
	}

}
