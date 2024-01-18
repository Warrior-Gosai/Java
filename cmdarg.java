class cmdarg
{
	public static void main(String[] args)
	{
		if(args.length>0)
		{
			System.out.println("Arguments Are : ");
			for(String cargs : args)
			{
				System.out.println(cargs);
			}
		}
		else
		{
			System.out.println("No Argument Found");
		}
	}
}