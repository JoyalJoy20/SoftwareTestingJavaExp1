package example;

public class Subclass1 extends Parent1{
	public void print()
	{
		super.print();
		System.out.println("mthod overriding");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subclass1 obj1=new Subclass1();
		obj1.print();
		BookMain obj2=new BookMain();
		obj2.print();
		

	}

}
