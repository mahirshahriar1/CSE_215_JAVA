package folder1;

public class Test_Point_and_Line {


	public static void main(String[] args) {
		Point p = new Point();
		Point q = new Point(3, 4);
		
		Line a = new Line(p, q);
		Line b = new Line(0, 0, 3, 4);
		
		System.out.println("Distance: " + a.getLength());
		System.out.println("Distance: " + b.getLength());
		
		Point x=b.getStart();
		System.out.println(x);
	}



}
