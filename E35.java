class E35
{
	public static void main(String args[])
	{
		int n = args.length;
		int i,max;
		int array[] = new int[n];
		for(i=0;i<n;i++)
		{
			array[i] = Integer.parseInt(args[i]);
		}
		if(n<9 || n>9)
		{
			System.out.println("Enter nine values");

		}		
		else
		{
			max = array[0];
			for(i=0;i<n;i++)
			{
				if(array[i] > max)
					max = array[i];
			}
			for(i=0;i<3;i++)
				System.out.print(array[i]+"  ");
			System.out.println();
			for(i=3;i<6;i++)
				System.out.print(array[i]+"  ");
			System.out.println();
			for(i=6;i<n;i++)
				System.out.print(array[i]+"  ");
			System.out.println();
			System.out.println("Maximum value in array is : "+max);
		}
	}
}
					