package interfaceEx;

public class InterfaceSub implements Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceSub obj=new InterfaceSub();
		obj.Sample();
		
	}

	@Override
	public void Sample() {
		// TODO Auto-generated method stub
		
		System.out.println("Result ="+(a+b));
	}

}
