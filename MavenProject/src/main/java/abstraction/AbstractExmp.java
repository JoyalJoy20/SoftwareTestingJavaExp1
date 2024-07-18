package abstraction;

public abstract class AbstractExmp {

	public abstract void Sample();
	
	public AbstractExmp()
	{
		System.out.println("it is constructor"); 
	}
	public static void StaticMethod()
	{
		System.out.println("it is Static Method");
	}
	
	public void InstanceMethod()
	{
		System.out.println("Instance method");
	}
	
}
