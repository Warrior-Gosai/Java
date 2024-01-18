// Example of Grade Using if else if ladder statement 

import java.util.*;

class grade{
	public static void main(String[] args) {
	      String grade="";
	      int  per;
	   	Scanner obj = new Scanner(System.in);
	  	
	  	System.out.println("Enter Value of Percentage : ");
	  	per=obj.nextInt();
	  	
	  	if(per>=70)
	  	{
	  	     grade="Out Standing ";
	  	}
	  	else if(per>=60 && per<70)
	  	{
	  	    grade="First Class";
	  	}    
	  	else if(per>=48 && per<60)
	  	{
	  	    grade="Second Class";
	  	}
	  	else if(per>=40 && per<48)
	  	{
	  	    grade="Pass Class";
	  	}
	  	else if(per>=0 && per<40)
	  	{
	  	    grade="Fail";
	  	}
	  	else
	  	{
	  	    System.out.println("Enter Valid Percentage ");
	  	}	 
	  	System.out.println("Grade : "+grade);
	}
}