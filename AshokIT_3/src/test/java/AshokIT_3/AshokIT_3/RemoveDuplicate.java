package AshokIT_3.AshokIT_3;

public class RemoveDuplicate {

	public static void main(String[] args) {
		meth1();
		meth2();

	}

	public static void meth2() {
		String str = "Java Programming";
		StringBuffer sb = new StringBuffer();
		char ch[] = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			int index = 0;
			index = str.indexOf(ch[i], i + 1);
			if (index == -1) {
				sb.append(ch[i]);
			}
		}
		System.out.println(sb);
	}

	public static void meth1() {
		String str = "Java Programming";
		char ch[] = str.toCharArray();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < ch.length; i++) {
			boolean found = false;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					found = true;
					break;
				}
			}
			if (!found) {
				sb.append(ch[i]);
			}
		}

		System.out.println(sb);

	}
}
