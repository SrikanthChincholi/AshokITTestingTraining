package collectionframework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListExample {
	public static void main(String[] args) {
		
		List list = new ArrayList();
		list.add(1);
		list.add('c');
		list.add("Srikanth");
		list.add(45.77);
		list.add(232322323);
		list.add(34.5678);
		list.add(1);
		list.add(null);
	
		List list1 = new ArrayList();
		list1.add("list1ele1");
		list1.add(0);
		
		list1.addAll(list);
		list1.remove(0);
		list1.removeAll(list);

		for (Object obj : list1) {
			System.out.println(obj);
		}
		
	

	}

}
