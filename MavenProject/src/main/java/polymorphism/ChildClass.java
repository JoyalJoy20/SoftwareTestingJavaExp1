package polymorphism;

public class ChildClass extends ParentClass{
	public void sample()
	{
		super.sample();
		System.out.println("Child Class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass obj=new ChildClass();
		obj.sample();
	}

}
