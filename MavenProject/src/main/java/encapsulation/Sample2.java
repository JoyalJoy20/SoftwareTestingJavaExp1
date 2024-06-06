package encapsulation;

public class Sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample1 obj=new Sample1();
		
		//set the values
		obj.setName("joyal");
		obj.setSalary(20000);
		
		//get the values
		System.out.println(obj.getName());
		System.out.println(obj.getSalary());
	}

}
