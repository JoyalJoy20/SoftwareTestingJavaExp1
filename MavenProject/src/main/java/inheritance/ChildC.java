package inheritance;

public class ChildC extends ChildB {
	public void childc()
	{
		System.out.println("Child class c");
	}

	public static void main(String[] args) {
		ChildC obj=new ChildC();
		obj.Parentclass();
		obj.childb();
		obj.childc();

	}

}
