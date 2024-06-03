package assignment;

public class Super_DisvisbleCheck extends Super_Addition {
	public void divisiblecheck()
	{
		int Sum=super.addtion();
		if(Sum%10==0)
		{
			System.out.println("It is divisible by 10");
		}else
		{
			System.out.println("it is not divisible by 10");
		}
	}

	public static void main(String[] args) {
		Super_DisvisbleCheck obj =new Super_DisvisbleCheck();
		obj.divisiblecheck();
		

	}

}
