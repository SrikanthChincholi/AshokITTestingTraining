package AshokIT_3.AshokIT_3;

public class StringExample {

	public static void main(String[] args) {

		char ch[] = { 'a', 'b', 'c' };

		String str = new String(ch);

		System.out.println(str);
		
		String s = "test";
		String s1 = "test";
		String s2 = "test1";
		String s4 = s1;
	
		String s3 = new String("test");
		System.out.println(s1==s3); //ref
		System.out.println(s1.equals(s3));//value
//		s4 = s1;
//		System.out.println(s1==s4);
//		System.out.println(s1.equals(s4));
		
		
		//System.out.println(s1 + "   " + s4);
	
		
	
	}

}
