package AshokIT_3.AshokIT_3;

public class ThreeDimArrays {
	
	public static void main(String[] args) {
		
		// [2][2][2]
		int arr[][][] = {{{10,20},{30,40}},{{50,60},{60,70}}};
		
		for(int i = 0;i<2;i++)
		{
			for(int j =0;j<2;j++)
			{
				for(int k =0;k<2;k++)
				{
					System.out.print(arr[i][j][k]+ " ");
				}
				System.out.println(" ");
			}
		}
		
		
	}

}
