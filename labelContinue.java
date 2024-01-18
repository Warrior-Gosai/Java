//Labeled Continue Statement Example 

class labelContinue{
	public static void main(String[] args) {
 	   Outer: for(int i=1; i<=5; i++)
		{
		    for(int j=1; j<=3; j++)
		    {
		        if(j==2)
		        {
		            continue Outer;
		        }
		        System.out.println("i : "+i+ " j : "+j);
		    }
		}
		System.out.println("End of Loop");
	}
}