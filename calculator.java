/**
 * @(#)calculator.java
 *
 *
 * @author 
 * @version 1.00 2024/1/1
 */

import java.util.*;

public class calculator {

    public static void main (String[] args) 
    {
    	Scanner obj = new Scanner(System.in);
    	System.out.println("Enter First No :");
    	double a=obj.nextDouble();
    	System.out.println("Enter Second No :");
    	double b=obj.nextDouble();
    	
    	System.out.println("Enter Your Choice ( +, -, *, /) : ");
    	char op = obj.next().charAt(0);
    	double ans;
    	
    	switch (op)
    	{
    		case '+':
    			ans=a+b;
    			break;
    		case '-':
    			ans=a-b;
    			break;
    		case '*':
    			ans=a*b;
    			break;
    		case '/':
    			ans=a/b;
    			break;
    		default :
    			System.out.println("Enter Valid Operator");
    			return;    			
    	}
    	System.out.printf("%.2f %c %.2f = %.2f",a,op,b,ans);
    	
	}
    
    
}