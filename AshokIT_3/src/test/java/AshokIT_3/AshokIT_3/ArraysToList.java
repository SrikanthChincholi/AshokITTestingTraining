package AshokIT_3.AshokIT_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArraysToList {

	public static void main(String[] args) {

		int[] input = new int[] { 10, 20, 30, 40 };
		List<Integer> output = new ArrayList<>();
		for (Integer l : input) {
			output.add(l);
		}

		Iterator<Integer> itr = output.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
