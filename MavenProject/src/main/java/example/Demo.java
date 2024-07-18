package example;
import java.util.Scanner;

public class Demo {
	 Scanner sc=new Scanner(System.in);
	int i;//flag=0;
	boolean isPrime=true;
	public void checkPrime()
	{
		System.out.println("Enter the number");
		int a=sc.nextInt();
		if(a<=1)
		{
			System.out.println("Enter the values greater than zero");
		}
		i=2;
		while(i<=a/2)
		{
			if(a%2==0)
			{
				isPrime=false;
				//flag=1;
				break;
			}
			i++;
		}
		 if(isPrime)
		{
			System.out.println("prime");
		}else
		{
			System.out.println("not prime");
		}
//		if(a==0 || a==1)
//		{
//			flag=1;
//			
//		}
//		i=2;
//		while(i<=a/2)
//		{
//			if(i%2==0)
//			{
//				//flag=1;
//				break;
//			}
//			
//		}
//		if(flag==0)
//		{
//			System.out.println("prime");
//		}else
//		{
//			System.out.println("not prime");
//		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d=new Demo();
		d.checkPrime();

	}

}
