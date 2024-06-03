package inheritance;

import java.util.Scanner;

public class BasicPay1 {
	Scanner sc=new Scanner(System.in);
	int salary,deduction,bonus;
	public void getBasePay()
	{
		System.out.println("Enter your basic salary :");
		 salary=sc.nextInt();
		System.out.println("Enter the deduction amount :");
		 deduction=sc.nextInt();
		System.out.println("Enter the bonus amount :");
		 bonus=sc.nextInt();
	}

}
