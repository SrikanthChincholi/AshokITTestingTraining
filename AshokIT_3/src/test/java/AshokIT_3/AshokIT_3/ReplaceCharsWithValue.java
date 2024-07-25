package AshokIT_3.AshokIT_3;

public class ReplaceCharsWithValue {

	public static void main(String[] args) {

		String str = "Java Beta Tata Vita";
		char ch[] = str.toCharArray();
		int count = 1;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == 'a') {
				str = str.replaceFirst(String.valueOf(ch[i]), String.valueOf(count));
				count++;
			}
		}
		System.out.println(str);
	}

}
