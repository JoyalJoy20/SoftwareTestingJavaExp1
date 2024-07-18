package example;

public class Rectangle {
	private int w,h;
	
	public Rectangle(int w,int h)
	{
		this.w=w;
		this.h=h;
	}
	public void setWidth(int w)
	{
		this.w=w;
	}
	public int getWidth()
	{
		return w;
	}
	public void setHeight(int h)
	{
		this.h=h;
	}
	public int getHeight()
	{
		return h;
	}
	public int getArea()
	{
		return w*h;
	}
	public int getPerimeter()
	{
		return 2*(w+h);
	}

}
