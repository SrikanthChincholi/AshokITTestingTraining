package AshokIT_3.AshokIT_3;

public class StringMethods {

	public static void main(String[] args) {

		String str = "AshokITAshokIT";
		String str1 = "test";

		// toCharArray();
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			// System.out.println(ch[i]);
		}

		// chatAt(index)
		char c = str.charAt(4);
		// System.out.println(c);

		// concat
		str = str.concat(str1);
		int value = 10;
		// System.out.println(str);
		str = str1 + value;
		// System.out.println();

		// endsWith()
		// System.out.println(str.endsWith("1"));

		// startsWith()
		str = "AshokITAshokIT";
		// System.out.println(str);
		// System.out.println(str.startsWith("A"));

		// trim()

		str = "   AshokITAshokIT ";
		System.out.println(str.trim());

		// lenght
		// System.out.println(str.length());

		// equals()
		str = str1;
		// System.out.println(str.equals(str1));

		// equals()
		str = "Test";
		str1 = "test";
		// System.out.println(str.equals(str1));

		// equalsIgnorecase()
		str = "Test";
		str1 = "test";
		// System.out.println(str.equalsIgnoreCase(str1));

		// format()

		value = 20;
		float f = 23.56f;
		String s = "Srikanth";

		/*System.out.println("value is : " + value);
		System.out.println("float is : " + f);
		System.out.println("s is : " + s);
		
		String val = String.format("Value of number is -- %d ", value);
		System.out.println(val);
		String val1 = String.format("float number is -- %f", f);
		System.out.println(val1);
		String val2 = String.format("name is -- %s ", s);
		System.out.println(val2);
		System.out.println(val+val1+val2);*/
		
		//UpperCase
		System.out.println(str.toUpperCase());
		
		//join
		
		String ss = String.join("-", str, str1);
		System.out.println(ss);
		String date = String.join("/", "15","02","1985" + " ");
		String timestamp = date + String.join(":", "06","25","000.00");
		System.out.println(timestamp);
		
		String name = "Aaryan";
		System.out.println(name.substring(2));
		System.out.println(name.substring(0,2));
		System.out.println(name.subSequence(0, 4));
		
		System.out.println(name.indexOf('A'));
		System.out.println(name.indexOf('r', 0));
		
		

	}

}
