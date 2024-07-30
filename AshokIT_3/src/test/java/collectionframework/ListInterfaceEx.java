package collectionframework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListInterfaceEx {

	public static void main(String[] args) {

		List list = new ArrayList<>();

		list.add(1);
		list.add('c');
		list.add("Srikanth");
		list.add(45.773);
		list.add(232322323);
		list.add(34.5678);
		list.add(1);
		list.add(null);

		list.remove(0);
		list.remove(new String("Srikanth"));
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		boolean found = list.contains(45.77);
		System.out.println(found);

		Object arr[] = list.toArray();

		List list1 = Arrays.asList(arr);

		System.out.println(Arrays.toString(arr));

		System.out.println(list1);

		ListIterator itr = list1.listIterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
			System.out.println(itr.hasPrevious());
		}
		
		

	}

}
