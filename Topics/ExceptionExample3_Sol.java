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

public class ExceptionExample3_Sol {
  
   public static void main(String args[]) {
      Person p1 = new Person();
      String str = p1.getName();
      try {
	    System.out.println(str.length());
	  } catch (NullPointerException ex) {
	      System.out.println("Name is not initialized");
	  }
      
   }
}