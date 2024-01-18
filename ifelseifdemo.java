// Example of if-elseif statement 

import java.util.*;

class ifelseifdemo{
	public static void main(String[] args) {
	      int a,b;
	  	Scanner obj = new Scanner(System.in);
	  	
	  	System.out.println("Enter Value of A : ");
	  	a=obj.nextInt();
	  	
	  	System.out.println("Enter Value of B : ");
	  	b=obj.nextInt();
	  	
	  	if(a>b)
	  	{
	  	    System.out.println("A is Greater than B ");
	  	}
	  	else if(b>a)
	  	{
	  	    System.out.println("B is Greater than A ");
	  	}
	  	else
	  	{
	  	    System.out.println("Both A and B Are same ");
	  	}	  	
	}
}