package inheritance;

public class Calculate_Deductions extends BasicPay1 {
	int Hra,Pf;

	public void deductionCalc()
	{
		Hra=(salary*5/100);
		Pf=(salary*20/100);
		
	}
}
