package mutlipleinhertiance;

public class MultiClassTwo implements InterfaceTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//interface objectname = new classname;
		InterfaceTwo obj2=new MultiClassTwo();
		obj2.display();
		obj2.sample();
		
		MultiClassTwo obj=new MultiClassTwo();
		obj.display();
		obj.sample();
	}
	

	@Override
	public void display() {
		System.out.println("Method Two");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sample() {
		// TODO Auto-generated method stub
		System.out.println("Method One");
	}

}
