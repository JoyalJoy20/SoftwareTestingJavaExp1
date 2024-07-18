package collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListInterfaceExmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> L1=new ArrayList<String>();
		L1.add("Chalakudy");
		L1.add("Thrissur");
		L1.add("Kochi");
		
		for(String place :L1)
		{
			System.out.println(place);
		}
		Iterator It=L1.iterator();
		while(It.hasNext())
		{
			System.out.println(It.next());
		}

	}

}
