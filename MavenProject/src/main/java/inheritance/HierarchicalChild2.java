package inheritance;

public class HierarchicalChild2 extends Hierarchical{
	public void childTwo()
	{
		System.out.println("Childe two");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HierarchicalChild2 obj =new HierarchicalChild2();
		obj.parent();
		obj.childTwo();

	}

}
