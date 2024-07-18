package mutlipleinhertiance;

public class MultiClass implements InterfaceOne,InterfaceTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiClass obj=new MultiClass();
		obj.display();
		obj.sample();
	}

	@Override
	public void sample() {
		System.out.println("Method two");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Method One");
	}

}
