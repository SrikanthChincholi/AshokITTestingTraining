package java8;

public class TestClass {

	public static void main(String[] args) {

		FunctionalInter fi = (a, b) -> {
			if (a > b) {
				return a;
			} else {
				return b;
			}
		};
		System.out.println(fi.test(10, 20));

	}

}
