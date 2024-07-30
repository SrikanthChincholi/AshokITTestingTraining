package collectionframework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;


public class LinkedHashSetEx {

	public static void main(String[] args) {

		Set set = new LinkedHashSet();
		
		set.add(11);
		set.add(21);
		set.add(31);
		
		
		set.add(1);
		set.add(2);
		set.add(3);
		
		set.add(1);
		set.add(2);
		set.add(3);
		
		set.add(11);
		set.add(21);
		set.add(31);
		
		
		
		System.out.println(set);
		
		List list = new ArrayList<>();
		
		list.addAll(set);
		
		Collections.sort(list);
		
		System.out.println(list);
		
				
		
		
		
		
		
		
		
	}

}
