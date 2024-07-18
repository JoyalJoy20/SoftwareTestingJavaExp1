package example;

public class MainExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person obj=new Person("joyal",22);
		System.out.println("Name :"+obj.getName());
		System.out.println("Age :"+obj.getAge());
		
		obj.setName("joy");
		obj.setAge(60);
		System.out.println("Name :"+obj.getName());
		System.out.println("Age :"+obj.getAge());
		

	}

}
