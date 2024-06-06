
package encapsulation;

import java.util.Scanner;

public class GetPin {
	int UserInput;
	Scanner sc=new Scanner(System.in);
	public int SetpinInfo()
	{
		System.out.println("Enter your 4 digit value :");
		UserInput=sc.nextInt();
		return UserInput;
		
	}
	


	public static void main(String[] args) {
		// object creation
		GetPin obj1 =new GetPin();
		SetAndValidate obj2=new SetAndValidate();
		
		//obj1.SetpinInfo();
		int PinInfo=obj1.SetpinInfo();
		obj2.setPin(PinInfo);
		obj2.getPin();
		obj2.ValidationCheck();
		

	}

}
