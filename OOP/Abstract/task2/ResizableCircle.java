package task2;

public class ResizableCircle extends Circle implements Resizable {

	public ResizableCircle(double radius)
	{
		super(radius);
	}
	
	@Override
	public void Resize(int percent) {
		radius=radius*((double)percent/100);		
	}

}
