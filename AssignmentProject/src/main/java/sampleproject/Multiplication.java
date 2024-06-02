package sampleproject;

public class Multiplication extends Operation {
	public Multiplication(int num1,int num2)
	{
		super(num1,num2);
	}
	public int PerformOperation()
	{
		return num1 * num2;
	}

	public static void main(String[] args) {
		Operation add=new Addition(2,3);
		Operation sub=new Substraction(5,3);
		Operation mul=new Multiplication(7,3);
		
		//displaying
		System.out.println("sum ="+add.PerformOperation());
		System.out.println("Difference ="+sub.PerformOperation());
		System.out.println("Product ="+mul.PerformOperation());
	

	}

}
