class Person {
	String name;
    Person(String name) {
        this.name = name;
    }
    Person() {
        name = null;
    }
	
	String getName()
	{
		return name;
	}
}

public class ExceptionExample3 {
  
   public static void main(String args[]) {
      Person p1 = new Person();
      String str = p1.getName();
      System.out.println(str.length());
      
   }
}