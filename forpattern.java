// Diamond Pattern Using For Loop 

import java.util.*;

class forpattern{
	public static void main(String[] args) {
	  int row, col, n, space=1;
	  Scanner obj = new Scanner(System.in);
	  	
	  	System.out.print("Number of Rows : ");
	  	n=obj.nextInt();
	  	
	  	space=n-1;
	  
	  	for(row=1; row<=n; row++)
	  	{
	  	    for(col=1; row<=space; col++)
	      	{
	      	    System.out.println(" ");
	      	}
	  	    space--;
	  	    for(col=1; col<=2*row-1; col++)
	  	    {
	  	        System.out.println("*");
	  	    }
	  	    System.out.println("");
	  	}
	  	space=1;
	  
	  	for(row=1; row<=n-1; row++)
	  	{
	  	    for(col=1; row<=space; col++)
	      	{
	      	    System.out.println(" ");
	      	}
	  	    space++;
	  	    for(col=1; col<=2*(n-col)-1; col++)
	  	    {
	  	        System.out.println("*");
	  	    }
	  	    System.out.println("");
	  	}
	}
}