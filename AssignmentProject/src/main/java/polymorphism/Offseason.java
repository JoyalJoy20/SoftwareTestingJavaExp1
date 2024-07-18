package polymorphism;

public class Offseason extends Onseason {
	boolean Offseason=false;
	public void SetDiscount()
	{
		if(Offseason)
		{
			System.out.println("It's offseason");
			discountAmt=(TotalPrice*40/100);
			System.out.println(discountAmt);
		}else
		{
			System.out.println("It's onseason");
			 super.SetDiscount();
		}
//		super.SetDiscount();
//		discountAmt=(TotalPrice*40/100);
//		System.out.println(discountAmt);
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Offseason obj =new Offseason();
		obj.SetDiscount();
		
	}

}
