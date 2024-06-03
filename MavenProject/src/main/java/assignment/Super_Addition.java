package assignment;

import java.util.Scanner;

public class Super_Addition {
	int num1,num2,sum;
	Scanner sc=new Scanner(System.in);
	public int addtion()
	{
		System.out.println("Enter two values :");
		num1=sc.nextInt();
		num2=sc.nextInt();
		int sum=num1+num2;
		System.out.println("sum ="+sum);
		return sum;
		
	}
	

}
