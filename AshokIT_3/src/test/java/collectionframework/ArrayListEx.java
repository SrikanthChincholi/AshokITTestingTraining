package collectionframework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;


public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList list = new ArrayList<>();

		list.add(1);
		list.add('c');
		list.add("Srikanth");
		list.add(45.773);
		list.add(232322323);
		list.add(34.5678);
		list.add(1);
		list.add(null);
		

		System.out.println(list);

		list.add(2, "new");

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		ArrayList list1 = new ArrayList<>();

		list1.addAll(list);

		// list1.remove(0);
		list1.remove(2);
		// list1.remove(4);
		// System.out.println(list1);
		System.out.println(list1.containsAll(list));

		System.out.println(list1);

		//for (int i = 0; i < list.size(); i++) {
			if (list.contains(232322323))
				System.out.println(list.indexOf(232322323));
		//}
			
			list.addAll(2, list1);
			System.out.println(list);
			
			
		
			
	}

}
