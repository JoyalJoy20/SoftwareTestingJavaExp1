package sampleproject;

public class Addition extends Operation {

	public Addition(int num1,int num2)
	{
		super(num1,num2);
	}
	public int PerformOperation()
	{
		return num1 + num2;
	}
}
