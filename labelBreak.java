//Labeled Break Statement Example 

class labelBreak{
	public static void main(String[] args) {
		Outer: for(int i=1; i<=5; i++)
		{
		    for(int j=1; j<=3; j++)
		    {
		        System.out.println("i : "+i+ " j : "+j);
		        if(i==3)
		        {
		            break Outer;
		        }
		    }
		}
		System.out.println("End of Loop");
	}
}