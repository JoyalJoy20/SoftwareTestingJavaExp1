package superkeyword;

public class SuperExample {
	int a,b,sum;
	public SuperExample()
	{
		System.out.println("constructor");
	}
	public void addition(int a,int b)
	{
		this.a=a;
		this.b=b;
		sum=a+b;
		System.out.println("sum ="+sum);
	}

}
