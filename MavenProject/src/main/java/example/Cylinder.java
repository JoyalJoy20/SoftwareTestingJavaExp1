package example;

public class Cylinder extends Circle {
	private float height;
	public Cylinder(float rad,float height)
	{
		super(rad);
		this.height=height;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle obj1=new Circle(2.5f);
		Cylinder obj2=new Cylinder(2.5f,4.0f);
		System.out.println(obj2.calculateArea());

	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("draw cylinder");
		
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		double circleArea=super.calculateArea();
		double sideArea=2*Math.PI*getRad()*height;
		
		return 2*circleArea+sideArea;
	}

}
