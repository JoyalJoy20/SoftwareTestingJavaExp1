package inheritance;

public class ChildClass extends ParentClass {

	public void substraction()
	{
		int c=b-a;
		System.out.println("result ="+c);
		
	}
	public static void main(String[] args) {
		ChildClass obj=new ChildClass();
		obj.addition();
		obj.substraction();

	}

}
