//Unlabeled Continue Statement Example 

class unlabelContinue{
	public static void main(String[] args) {
	    for(int i=1; i<=5; i++)
		{
		    for(int j=1; j<=3; j++)
		    {		   
		        if(j==2)
		        {
		            continue;
		        }
		        System.out.println("i : "+i+ " j : "+j);
		    }
		}
		System.out.println("End of Loop");
	}
}