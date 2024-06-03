package superkeyword;

public class SampleExmp3 {

	private static int maxspeed;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car obj =new Car();
		obj.display();
		System.out.println(obj.maxspeed);

	}
	
}
class  vehicle
{
	int maxspeed=120;
	public void sample()
	{
		System.out.println("parent class");
	}
	
}
class Car extends vehicle
{
	int maxspeed=200;
	public void display()
	{
		super.sample();
		System.out.println(super.maxspeed);
	}
}

