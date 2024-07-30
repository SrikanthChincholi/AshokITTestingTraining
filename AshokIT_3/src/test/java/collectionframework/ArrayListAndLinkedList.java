package collectionframework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListAndLinkedList {
	
	public static void main(String[] args) {
		ArrayList list = new ArrayList<>();
		ArrayList list1 = new ArrayList<>();
		
		list.add(1);
		list.add('c');
		list.add("Srikanth");
		list.add(45.773);
		list.add(232322323);
		list.add(34.5678);
		list.add(1);
		list.add(null);
		
		list1.addAll(list);

		list1.add(0);
		list1.add(100);
		list1.add(99);

		System.out.println(list1);

		list.retainAll(list1);

		System.out.println(list);

		ArrayList al = new ArrayList<>();
		al.add("Srikanth");
		al.add("Chincholi");
		al.add("1");
		al.add("34");

		System.out.println(al);

		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			if (al.equals("1")) {
				al.remove("1");
			}
			System.out.println(itr.next());
		}

	}

}
