package encapsulation;

public class ParentClass {

	private int a,b;
	public void getter()
	{
		System.out.println("values :"+a+" "+b);
	}
	public void setter(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	
}
