package aggregation;

public class ClassB {
	ClassA reference;
	String str;
	public ClassB(String str,ClassA reference)
	{
		this.str=str;
		this.reference=reference;
	}
	public void display()
	{
		System.out.println(str);
		System.out.println(reference.a+" "+reference.b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassA objA=new ClassA(20,30);
		ClassB obj=new ClassB("hello",objA);
		obj.display();
	}

}
