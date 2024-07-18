package exception;

public class Exceptionexmp {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		try
		{
			int arr[]=new int[6];
			 arr[7]=60;
			int c=5/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
		System.out.println("array exception ");
		}
		catch(Exception e)
		{
			System.out.println("parent exception");
		}
		finally
		{
			System.out.println("Finally block will always executed");
		}
		System.out.println("rest of the code");
	}

}
