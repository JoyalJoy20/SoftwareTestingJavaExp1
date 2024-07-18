package example;

public  class Circle extends Shape {
	private float rad;
	public Circle(float rad)
	{
		this.rad=rad;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("drawing the circle");
		
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return Math.PI * rad * rad;
	}
	public float getRad()
	{
		return rad;
	}

}
