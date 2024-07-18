package exception;

public class ThrowsUnchecked {
	public static void ex() throws ArithmeticException
	{
		throw new ArithmeticException("ArithmeticException");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowsUnchecked.ex();

	}

}
