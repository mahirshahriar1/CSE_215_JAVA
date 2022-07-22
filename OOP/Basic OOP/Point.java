//Point and lines are connected

package folder1;

public class Point {	
	private int x;
	private int y;
	
	public Point() {
		x=0;
		y=0;
	}
	
	public Point(int x, int y) 
	{
		this.x = x;
		this.y = y;
	}
	
	public int getX() 
	{
		return x;
	}
	
	public void setX(int x) 
	{
		this.x = x;
	}
	
	public int getY() 
	{
		return y;
	}
	
	public void setY(int y)
	{
		this.y = y;
	}
	
	public String toString() {
		return "Point[x: " + x + ", y: " + y + "]";
	}
	
	public double distanceTo(Point x)
	{
		int dx = this.x - x.getX();
		int dy = this.y - x.getY();
		return Math.sqrt((dx * dx) + (dy * dy));
	}
	
	public double distanceTo(Point x, Point y)
	{
		int dx = y.getX() - x.getX();
		int dy = y.getY() - x.getY();
		return Math.sqrt((dx * dx) + (dy * dy));
	}
	
}
