public class j1
{
	public static void main(String[] args) {
		int arr1[][]={{2,5,3},{3,7,2},{1,4,6}};
		int arr2[][]={{2,4,6},{1,3,5},{8,5,7}};
		int mul[][]=new int[3][3];
		System.out.println("The Element Of First array :");
		for (int i=1;i<=3;i++)
		{
			for(int j=1;j<=3;j++)
			{
				System.out.print(arr1[i][j]);
			}
			System .out.println(" ");
		}
		System.out.println("The Element Of Second array :");
		for (int i=1;i<=3;i++)
		{
			for(int j=1;j<=3;j++)
			{
				System.out.print(arr2[i][j]);
			}
			System.out.println(" ");
		}
		System .out.println("Multiplication of 2 array is :");
		mul[0][0]=0;
		if(arr1.length==arr2.length)
		{
			for (int i=1;i<=3;i++)
			{
				for(int j=1;j<=3;j++)
				{
					for(int k=1;k<=3;k++)
					{
						mul[i][j]=mul[i][j]+arr1[i][k]+arr2[k][j];
					}
					System .out.print(mul[i][j]+" ");
				}
				System .out.println(" ");
			}
		}
	}
}