package AshokIT_3.AshokIT_3;

import java.util.Arrays;

public class StringCompare {

	public static void main(String[] args) {

		String str[] = { "india", "uk", "usa", "aus", "can" };

		for (int i = 0; i < str.length; i++) {
			String temp = "";
			for (int j = i + 1; j < str.length; j++) {
				if (str[i].compareTo(str[j]) > 0) {
					temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}

			}
		}

		System.out.println(Arrays.toString(str));
	}
}
