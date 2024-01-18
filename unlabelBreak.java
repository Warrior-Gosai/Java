//Unlabel Break Statement Example 

class unlabelBreak{
	public static void main(String[] args) {
		for(int i=0; i<5; i++)
		{
		    System.out.println("Value :"+i);
		    if(i==3)
		    {
		        break;
		    }
		}
		System.out.println("End of Loop");
	}
}