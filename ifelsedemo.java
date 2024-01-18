// Example of if-else statement 

import java.util.*;

class ifelsedemo{
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
	  	else
	  	{
	  	    System.out.println("B is Greater than A ");
	  	}
	}
}