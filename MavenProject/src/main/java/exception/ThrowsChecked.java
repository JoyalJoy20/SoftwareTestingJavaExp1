package exception;

import java.io.IOException;

public class ThrowsChecked {
	//checked 

	public static void ex() throws IOException,ArithmeticException
	{
	int a=10;
	int b=20;
	int sum=a+b;
	//throw new IOException("IOException");
	
	throw new ArithmeticException("ArithmeticException");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			ThrowsChecked.ex();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		catch (ArithmeticException e)
		{
			System.out.println(e);
		}
	}

}
