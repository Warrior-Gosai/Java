/**
 * @(#)day.java
 *
 *
 * @author 
 * @version 1.00 2024/1/1
 */
import java.util.*;

public class day {

    public static void main (String[] args) 
    {
    	Scanner obj = new Scanner(System.in);
    	System.out.print("Enter Day No :");
    	int no=obj.nextInt();    	
    	    
    	switch (no)
    	{
    		case 1:
    			System.out.println("Monday");
    			break;
    		case 2:
    			System.out.println("Tuesday");
    			break;
    		case 3:
    			System.out.println("Wednesday");
    			break;
    		case 4:
    			System.out.println("Thursday");
    			break;
    		case 5:
    			System.out.println("Friday");
    			break;
    		case 6:
    			System.out.println("Saturday");
    			break;
    		case 7:
    			System.out.println("Sunday");
    			break;
    		default :
    			System.out.println("ENTER VALID DAY NUMBER");
    			return;    			
    	}         
	}
}