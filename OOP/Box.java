package com.mahir;


public class Box {

	public double width;
	public double height;
	public double depth;
	
	public Box() {
		width=height=depth=1;
	}
	public Box(double len)
	{
		width=height=depth=Math.abs(len);
	}
	public Box(double w, double h, double d)
	{
		width=Math.abs(w);
		height=Math.abs(h);
		depth=Math.abs(d);
	}
	public Box(Box box)
	{
		width=box.width;
		height=box.height;
		depth=box.depth;
	}
	public void setDim(double w, double h, double d)
	{
		width=Math.abs(w);
		height=Math.abs(h);
		depth=Math.abs(d);
	}
	public boolean equalTo(Box o)
	{
		if(o.width==width&&o.height==height&&o.depth==depth)
			return true;
		else
			return false;
	}
	public double volume()
	{
		return width*height*depth;
	}
	public String toString()
	{
		String s="Height : "+Double.toString(height)+
				", Width : "+Double.toString(width)+
				", Depth : "+Double.toString(depth);
		return s;
		
	}
}
