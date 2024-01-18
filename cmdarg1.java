class cmdarg1
{
	public static void main(String[] args)
	{
		if(args.length>0)
		{
			System.out.println("Arguments Are : ");
			for(int i=0; i<args.length; i++)
			{
				System.out.println(args[i]);
			}
		}
		else
		{
			System.out.println("No Argument Found");
		}
	}
}