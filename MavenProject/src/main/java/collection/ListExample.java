package collection;
import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list1=new ArrayList();
		list1.add("apple");
		list1.add("orange");
		list1.add("grape");
		System.out.println(list1);
		//System.out.println(list1.contains(list1));
		
		//non-generic arraylist
		ArrayList l1=new ArrayList();
		l1.add("apple");
		l1.add(10);
		l1.add('a');
		System.out.println(l1);
		
		//generic arraylist
		ArrayList<String>l2=new ArrayList<String>();
		l2.add("chalakudy");
		l2.add("thrissur");
		l2.add("Kochi");
//		l2.add("a");
		System.out.println(l2);
		System.out.println(l2.size());
		System.out.println(l2.isEmpty());
		System.out.println(l2.contains('a'));
		
		
		ArrayList<Integer>l3=new ArrayList();
		l3.add(100);
		l3.add(200);
		l3.add(100);
		
		System.out.print("For Loop\n");
		for(int i=0;i<l3.size();i++)
		{
			System.out.println(l3.get(i));
		}
		
		System.out.print("For Each Loop\n");
		for(int num:l3)
		{
			System.out.println(num);
		}
		//add one list elements to another list
		list1.addAll(l1);
		System.out.println(list1);
		//all same elements remains and other elements  in both list got removed
		list1.removeAll(l1);
		System.out.println(list1);
		list1.remove(0);
		System.out.println(list1);
		list1.add("watermalon");
		System.out.println(list1);
	}

}
