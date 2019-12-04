class E34
{
	public static void main(String args[])
	{
		int n = args.length;
		int i;
		if(n < 4 || n > 4)
		{
			System.out.println("Please enter 4 integers");
		}
		else
		{
			for(i=0;i<2;i++)
			{
				System.out.print(args[i]+"  ");
			}
			System.out.println();
			for(i=2;i<4;i++)
			{
				System.out.print(args[i]+"  ");
			}
		}
	}
}