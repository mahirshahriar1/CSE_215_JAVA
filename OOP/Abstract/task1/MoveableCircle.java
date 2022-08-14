package task1;

public class MoveableCircle implements Moveable{
	
	private int radius;
	private MoveablePoint center;
	
	public MoveableCircle(int x, int y, int xSpeed, int ySpeed, int radius)
	{
		center= new MoveablePoint(x, y, xSpeed, ySpeed);
		this.radius=radius;
	}

	@Override
	public String toString() {
		return "MoveableCircle [radius=" + radius + ", center=" + center + "]";
	}

	@Override
	public void moveUp() {
		center.moveUp();
		
	}

	@Override
	public void moveDown() {
		center.moveDown();
		
	}

	@Override
	public void moveLeft() {
		center.moveLeft();
		
	}

	@Override
	public void moveRight() {
		center.moveRight();
		
	}
	

}
