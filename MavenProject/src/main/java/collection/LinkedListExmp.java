package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LinkedList<String> Lknlst=new LinkedList<String>();
		 Lknlst.add("march");  
		 Lknlst.add("april");  
		 Lknlst.add("may");  
		 Lknlst.add("june"); 
		 System.out.println(Lknlst);
		 
		 Iterator It=Lknlst.iterator();
			while(It.hasNext())
			{
				String element=(String)It.next();
				if (element=="april") {
					It.remove(); 
			    }
			}
			System.out.println(Lknlst);
			 
	}

}
