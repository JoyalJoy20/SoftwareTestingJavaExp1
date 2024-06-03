package inheritance;

public class TotalSalary extends Calculate_Deductions {
	
	//float total;
	public float totalSalaryCalc()
	{
		float total=(salary+Hra-Pf-deduction+bonus);
		 return total;
	}
	public void salarySlip()
	{
		System.out.println("\tSalary slip of the employee\n");
		System.out.println("Basic pay:"+salary);
		System.out.println("Deduction :"+deduction);
		System.out.println("HRA :"+Hra);
		System.out.println("PF :"+Pf);
		System.out.println("Bonus :"+bonus);
		System.out.println("Total salary by hand :"+totalSalaryCalc());
	}

	public static void main(String[] args) {
		TotalSalary obj=new TotalSalary();
		obj.getBasePay();
		obj.deductionCalc();
		obj.totalSalaryCalc();
		obj.salarySlip();
		
	}

}
