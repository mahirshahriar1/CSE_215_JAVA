package Practice;

public class Student {

	private int id;
	private String firstName, lastName;
	private double cgpa;
	
	private Address add;
	
	Student(int id, String firstName, String lastName, double cgpa, Address obj)
	{
		this.id=id;
		this.firstName=firstName;
		this.lastName=lastName;
		this.cgpa=cgpa;
		add=obj;
	}
	
	public int getId()
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id=id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getCgpa() {
		return cgpa;
	}

	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}
	
	public Address getAddress()
	{
		return add;
	}
	
	public void setAddress(Address obj)
	{
		add=obj;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", cgpa=" + cgpa + "]";
	}

	 
	
	
	

	
}
