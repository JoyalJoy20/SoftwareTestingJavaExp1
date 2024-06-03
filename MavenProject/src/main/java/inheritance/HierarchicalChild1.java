package inheritance;

public class HierarchicalChild1 extends Hierarchical {
	public void childOne()
	{
		System.out.println("Child One");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HierarchicalChild1 obj=new HierarchicalChild1();
		obj.childOne();
		obj.parent();
	}

}
