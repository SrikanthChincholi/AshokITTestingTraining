package javaprgms;


import java.util.Arrays;

import org.testng.annotations.Test;

public class RotateAnArray {

	@Test
	public void test1() {
		int arr[] = { 1, 2, 3, 4, 5 };
		int temp = 0;
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < arr.length-1; j++) {
				temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = temp;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	@Test
	public void test2() {
		int arr[] = { 1, 2, 3, 4, 5 };
		int temp = 0;
		for (int i = 0; i < 2; i++) {
			for (int j = arr.length-1; j > 0; j--) {
				temp = arr[j];
				arr[j] = arr[j - 1];
				arr[j - 1] = temp;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
