package abstraction;

public class NonAbstract extends AbstractExmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NonAbstract obj =new NonAbstract();
		obj.InstanceMethod();
		NonAbstract.StaticMethod();
		obj.Sample();
		
	}

	@Override
	public void Sample() {
		// TODO Auto-generated method stub
		
		System.out.println("it's an sample method");
	}

}
