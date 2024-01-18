// Reverse Number Using While Loop 
// 123-> 321

import java.util.*;

class revnum{
	public static void main(String[] args) {
	  int num, rev=0, digit;
	  Scanner obj = new Scanner(System.in);
	  	
	  	System.out.println("Enter Any Number: ");
	  	num=obj.nextInt();
	  	
	  	while(num!=0)
	  	{
	  	    digit=num%10;
	  	    rev=rev*10 + digit;
	  	    num = num/10;
	  	}
	  	System.out.println("Reverse Number: "+rev);
	}
}