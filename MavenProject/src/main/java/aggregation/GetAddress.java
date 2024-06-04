package aggregation;

public class GetAddress {
	GetNameandRollno reference;
	String address;
	public GetAddress(String address, GetNameandRollno reference)
	{
		this.address=address;
		this.reference=reference;
	}

	public void display()
	{
		System.out.println(address);
		System.out.println(reference.name+" "+reference.age);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetNameandRollno objp=new GetNameandRollno("joyal",23);
		GetAddress obj=new GetAddress("Chalakudy",objp);
		obj.display();
		
	}

	
}
