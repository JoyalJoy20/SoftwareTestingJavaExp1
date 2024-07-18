package example;

public class RectangleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle obj=new Rectangle(20,30);
		System.out.println("Area ="+obj.getArea());
		System.out.println("Perimeter ="+obj.getPerimeter());
		
		///updated
		 obj.setHeight(40);
		 obj.setWidth(50);
		 System.out.println("new area and perimeter");
		 System.out.println("Area ="+obj.getArea());
		 System.out.println("Perimeter ="+obj.getPerimeter());

	}

}
