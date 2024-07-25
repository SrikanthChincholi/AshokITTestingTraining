package AshokIT_3.AshokIT_3;

public class RemoveDuplicates {
	static String name = "Aaryan Chincholi";

	public static void main(String[] args) {
		System.out.println(meth1(name));
		System.out.println(meth2(name));

	}

	public static String meth1(String name) {
		StringBuilder sb = new StringBuilder();

		char ch[] = name.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			int ind = name.indexOf(ch[i], i + 1);
			if (ind == -1) {
				sb.append(ch[i]);
			}
		}
		return sb.toString();
	}

	public static String meth2(String name) {
		StringBuffer sb = new StringBuffer();
		char ch[] = name.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			boolean found = false;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					found = true;
					break;
				}
			}
			if (!found)
				sb.append(ch[i]);
		}
		return sb.toString();

	}
}
