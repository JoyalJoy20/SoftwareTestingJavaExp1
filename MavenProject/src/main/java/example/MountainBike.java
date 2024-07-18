package example;

public class MountainBike extends Bicycle{
	public int seatHeight;
	public MountainBike(int gear,int speed,int startheight)
	{
		super(gear,speed);
		seatHeight=startheight;
	}
	public void setSeatheight(int Height)
	{
		seatHeight=Height;
	}
	public String toString()
	{
		return(super.toString()+"\nseat height is"+seatHeight);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MountainBike mb=new MountainBike(3,100,45);
		System.out.println(mb.toString());
		
		mb.speedup(20);
		System.out.println(mb.toString());
		mb.applyBrake(50);
		mb.setSeatheight(30);
		System.out.println(mb.toString());
				

	}

}
