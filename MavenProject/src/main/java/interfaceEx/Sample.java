package interfaceEx;

//
//class Animal{
//	public void eat()
//	{
//		System.out.println("Eat");
//	}
//}
//class WildAnimal{
//	public void roar()
//	{
//		System.out.println("Roar");
//	}
//}
//class Tiger extends Animal{
//	
//}
interface interfaceOne{
	public void MethodOne();
	
}
interface interfaceTwo
{
public void MethodTwo();	
}

class A implements interfaceOne,interfaceTwo
{

	@Override
	public void MethodOne() {
		// TODO Auto-generated method stub
		System.out.println("Interface1 method declaration");
	}

	@Override
	public void MethodTwo() {
		// TODO Auto-generated method stub
		System.out.println("Interface2 method declaration");
		
	}
	
}

public class Sample {

	public static void main(String[] args) {
//		Tiger obj=new Tiger();
//		obj.eat();
		A a=new A();
		a.MethodOne();
		a.MethodTwo();

	}

}
