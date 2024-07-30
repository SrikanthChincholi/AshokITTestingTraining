package collectionframework;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListEx {

	public static void main(String[] args) {

		LinkedList ll = new LinkedList();

		ll.addFirst(10);
		ll.add("1");
		ll.add(2);
		ll.add("sri");
		ll.add(34);
		ll.addLast("last");
		ll.addFirst(100);
		ll.add("1");
		ll.add(2);
		ll.add("1");
		ll.add(2);

		/*
		 * //ll.remove(2);
		 * 
		 * System.out.println(ll);
		 * 
		 * System.out.println(ll.getFirst());
		 * 
		 * System.out.println(ll.getLast());
		 * 
		 * System.out.println(ll.element());
		 * 
		 * //ll.removeAll(ll);
		 * 
		 * //System.out.println(ll.peekFirst());
		 * 
		 * System.out.println(ll.poll());
		 * 
		 * System.out.println(ll);
		 * 
		 * System.out.println(ll.peek());
		 

		ll.offer(56);

		System.out.println(ll);

		ll.offerFirst(23);

		System.out.println(ll);

		ll.offerFirst(23);

		System.out.println(ll);

		ll.pollFirst();

		System.out.println(ll);

		ll.pollLast();

		System.out.println(ll);

		System.out.println(ll.element());

		// ll.clear();

		System.out.println(ll.element());

		ll.removeFirstOccurrence(2);

		System.out.println(ll);

		ll.set(5, 90);

		System.out.println(ll);

		for (int i = 0; i < ll.size(); i++) {
			// System.out.println(ll.get(i));
		}
*/
		ListIterator litr = ll.listIterator();
		while (litr.hasNext()) {
			 System.out.println(litr.next());
		}
		
		

		Iterator it = ll.descendingIterator();
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
		
	

	}

}
