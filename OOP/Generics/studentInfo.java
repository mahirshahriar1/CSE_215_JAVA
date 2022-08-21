package lab18;

public class studentInfo {
	private int ID;
	private String name;
	private double cgpa;
	
	
	public studentInfo(int iD, String name, double cgpa) {
		ID = iD;
		this.name = name;
		this.cgpa = cgpa;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCgpa() {
		return cgpa;
	}
	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}
	
	
	@Override
	public String toString() {
		return (ID+ ". " + name + ". " + cgpa);
	}
	
	

}
