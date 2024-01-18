// Check for Entered Number is Palindrome or Not 

import java.util.*;

class dowhile{
	public static void main(String[] args) {
		int num, rev=0, rem, temp;		
		Scanner obj = new Scanner(System.in);
	  	
	  	System.out.print("Enter Number: ");
	  	num=obj.nextInt();
	  	
	  	temp=num;
	  	
	  	do{
	  	    rem=num%10;
	  	    rev=rev*10+rem;
	  	    num=num/10;
	  	} while(num != 0);
	  	
	  	if(temp==rev)
	  	{
	  	    System.out.println("Number is Palindrome: "+rev);
	  	}
	  	else
	  	{
	  	    System.out.println("Number is Not Palindrome: "+rev);
	  	}
	}
}