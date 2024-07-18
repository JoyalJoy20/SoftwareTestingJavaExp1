package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetExmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//hashset class
		Set<String> St = new HashSet<String>();   
		St.add("Monday");
		St.add("Tuesday");
		St.add("Wednesday");
		System.out.println(St);
		
		//linkedHashset
		
		Set<String> Lst = new LinkedHashSet<String>();
		Lst.add("Thursday");
		Lst.add("Friday");
		Lst.add("Saturday");
		System.out.println(Lst);
		
		//addall
		  Set<Integer> data1 = new LinkedHashSet<Integer>(); 
		  data1.add(21);
		  data1.add(33);
		  data1.add(45);
		  System.out.println(data1);
		  ArrayList<Integer> newdata=new ArrayList<Integer>();
		  newdata.add(23);
		  newdata.add(44);
		  newdata.add(90);
		  data1.addAll(newdata);
		  System.out.println("new data :"+data1);
		  
		  
		  
		
	}

}
