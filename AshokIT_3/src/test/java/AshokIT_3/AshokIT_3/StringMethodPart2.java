package AshokIT_3.AshokIT_3;

public class StringMethodPart2 {
	
	public static void main(String[] args) {
		
		String str = "TesTtT1TesT2TesT3TesT";
		
		//UpperCase
		
		System.out.println(str.toUpperCase());
		
		System.out.println(str.toLowerCase());
		
		System.out.println(str.toUpperCase().equals("TEst123".toUpperCase()));
		
		int ind = str.indexOf('T');
		System.out.println(ind);
		
		byte b[] = str.getBytes();
		for(byte bb :b)
		{
			System.out.println((char)bb);
		}
		
		//System.out.println(str.replace('T', 'G'));
		
		//System.out.println(str.replaceAll("Test123", "JAVA"));
		
		System.out.println(str.substring(2));
		
		System.out.println(str.substring(0, 3));
		
		System.out.println(str.lastIndexOf('T'));
		
		System.out.println(str.lastIndexOf("TesT"));
		
		System.out.println(str.contentEquals("TesT"));
	
		int value = 10;
		//System.out.println(str + value);
		System.out.println(str+String.valueOf(value));
		
		float f = 13.2f;
		System.out.println(str.concat(String.valueOf(f)));
	
		
		
		
	}

}
