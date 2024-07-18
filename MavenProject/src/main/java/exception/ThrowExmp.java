package exception;

public class ThrowExmp {

	public static void addition(int a,int b)
	{
		int sum=a+b;
		if(sum>50)
		{
			throw new ArithmeticException("sum is greater than 50");
		}
		else
		{
			System.out.println("sum is less than 50");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			addition(50,20);
		}
		catch (ArithmeticException e)
		{
			System.out.println("sum is greater"
					+ "");
		}
	}

}
