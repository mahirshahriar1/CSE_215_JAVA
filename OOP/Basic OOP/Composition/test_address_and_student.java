package Practice;

public class test_address_and_student {

	public static void main(String[] args) {
		
		Address a1=new Address("Concord","road-1","mohammadpur","dhaka","1101");
		Student s1=new Student(2,"Mahir", "Shahriar", 56.5, a1);
		System.out.println(s1);
		
		System.out.println(s1.getAddress());
		
	
	}

}
