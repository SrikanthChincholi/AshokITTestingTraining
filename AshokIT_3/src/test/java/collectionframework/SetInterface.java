package collectionframework;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetInterface {

	public static void main(String[] args) {

		Set set = new HashSet<>();
		Set set1 = new HashSet<>();

		set.add(1);
		set.add(2);
		set.add(3);
		set.add("srikanth");
		set.add(3000.00);
		set.add("test");
		set.add(1);
		set.add(2);
		set.add(3);
		set.add("srikanth");
		set.add(3000.00);
		set.add("test");
		set.add(null);
		set.add(null);
		set.add(11);
		set.add(21);
		set.add(31);
		set.add("2srikanth");
		set.add(30002.00);
		set.add("test3");
		
		set1.addAll(set);
		
		System.out.println(set);
		System.out.println("----------------");
		System.out.println(set1);

		// System.out.println(set);

		/*
		 * Iterator itr = set.iterator(); while (itr.hasNext()) {
		 * System.out.println(itr.next()); }
		 */

		/*
		 * for (Object obj : set) { System.out.println(obj); }
		 */

		boolean flag = set.contains(null);
		System.out.println(flag);
		
		flag = set.remove(1);
		System.out.println(flag);
		
		flag = set.containsAll(set1);
		System.out.println(flag);
		
		set.clear();
		
		flag = set.isEmpty();
		System.out.println(flag);
		
		Object arr[] = set1.toArray();
		System.out.println(Arrays.toString(arr));
		
		
	}

}
