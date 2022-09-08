abstract class Shape implements Comparable<Shape> {
    abstract double getArea();
    
    @Override // Implement the compareTo method defined in Comparable
  	public int compareTo(Shape o) {
 		if (getArea() > o.getArea())
 			return 1;
 		else if (getArea() < o.getArea())
 			return -1;
 		else
 			return 0;
 	}
}



class ComparableRectangle extends Shape {
    
    double width, height;
	
  	/** Construct a ComparableRectangle with specified properties */
 	public ComparableRectangle(double w, double h) {
 		this.width = w;
 		this.height = h;
	}
 
	public double getArea() {
		return width * height;
	}
    

   @Override // Implement the toString method in GeometricObject
   public String toString() {
     return super.toString() + " Area: " + getArea();
   }
}


class ComparableCircle extends Shape {
    static final double PI = 3.14;
	double radius;
	public ComparableCircle(double r)
	{
		this.radius = r;
	}
	
	public double getArea() {
		return PI * radius * radius;
	}
	@Override // Implement the toString method in GeometricObject
   public String toString() {
     return super.toString() + " Area: " + getArea();
   }
}



public class Main {
	public static void main(String[] args) {
		Shape[] shapes = {
			new ComparableRectangle(3.4, 5.4),
	    	        new ComparableRectangle(13.24, 55.4),
   			new ComparableRectangle(7.4, 35.4),
   			new ComparableRectangle(1.4, 25.4),
   			new ComparableCircle(5.0),
   			new ComparableCircle(10.0),
   			new ComparableCircle(20.0)
		};
											
   		java.util.Arrays.sort(shapes);
  		for (Shape shape: shapes) {
 			System.out.print(shape + " ");
 			System.out.println();
 		}
 	}
}
