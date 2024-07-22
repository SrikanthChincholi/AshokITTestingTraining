package AshokIT_3.AshokIT_3;

public class JaggedArray {

	public static void main(String[] args) {
		int a[][] = { { 10, 20, 30, 50, 7, 6 }, { 12, 10, 40, 50, 60 } };
		getValues(a);
	}

	public static void getValues(int a[][]) {

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println("");
		}

	}

}
