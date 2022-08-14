package task1;

public class MoveablePoint implements Moveable {
	 int x,y,xSpeed,ySpeed;

	public MoveablePoint(int x, int y, int xSpeed, int ySpeed) {
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}

	@Override
	public String toString() {
		return "MoveablePoint [x=" + x + ", y=" + y + ", xSpeed=" + xSpeed + ", ySpeed=" + ySpeed + "]";
	}

	@Override
	public void moveUp() {
		y+=ySpeed;		
	}

	@Override
	public void moveDown() {
		y-=ySpeed;
		
	}

	@Override
	public void moveLeft() {
		x-=xSpeed;
		
	}

	@Override
	public void moveRight() {
		x+=xSpeed;
		
	}
	
	
	

}
