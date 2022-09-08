class Rectangle {
	double width, height;
	public Rectangle(double w, double h)
	{
		width = w;
		height = h;
	}
	public double getArea() {
		return width * height;
	}
}
class ComparableRectangle extends Rectangle 
	implements Comparable<ComparableRectangle> {
  	/** Construct a ComparableRectangle with specified properties */
 	public ComparableRectangle(double width, double height) {
 		super(width, height);
	}
 
	@Override // Implement the compareTo method defined in Comparable
  	public int compareTo(ComparableRectangle o) {
 		if (getArea() > o.getArea())
 			return 1;
 		else if (getArea() < o.getArea())
 			return -1;
 		else
 			return 0;
 	}


   @Override // Implement the toString method in GeometricObject
   public String toString() {
     return super.toString() + " Area: " + getArea();
   }
}

public class Main {
	public static void main(String[] args) {
		ComparableRectangle[] rectangles = {
											new ComparableRectangle(3.4, 5.4),
											new ComparableRectangle(13.24, 55.4),
   											new ComparableRectangle(7.4, 35.4),
   											new ComparableRectangle(1.4, 25.4)
		    
		};
											
   		java.util.Arrays.sort(rectangles);
  		for (Rectangle rectangle: rectangles) {
 			System.out.print(rectangle + " ");
 			System.out.println();
 		}
 	}
}
