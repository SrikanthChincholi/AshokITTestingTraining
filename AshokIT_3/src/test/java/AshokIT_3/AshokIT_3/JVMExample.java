package AshokIT_3.AshokIT_3;

public class JVMExample {

	int i = 10;
	static int j;

	static {
		System.out.println("Static block");
	}

	{
		System.out.println("Instance block");
		System.out.println(j);
		System.out.println(i);
	}

	public static void main(String[] args) {

		JVMExample jvm = new JVMExample();
		j = 20;
		System.out.println(j);

	}

}
