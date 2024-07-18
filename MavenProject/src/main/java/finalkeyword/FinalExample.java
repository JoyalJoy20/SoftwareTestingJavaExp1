package finalkeyword;

public class FinalExample extends FInalMethodExmp {

	final int a;
	public FinalExample()
	{
		a=30;
	}
	//final method-cannot override
//	public final  void sample()
//	{
//		System.out.println("main method");
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalExample obj=new FinalExample();
		System.out.println(obj.a);
		
		obj.sample();
		
	}

}
