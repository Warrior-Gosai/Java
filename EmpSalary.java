/**
 * @(#)EmpSalary.java
 *
 *
 * @author 
 * @version 1.00 2024/1/2
 */

import java.util.*;

public class EmpSalary 
{
   
    public static void main (String[] args) 
    {
    	double   ta, da, hra, ma, tax;
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter Employee Name :");
		String name=obj.nextLine();
		
		System.out.println("Enter City Name :");
		String city=obj.nextLine();
		
		System.out.println("Enter Employee Designation :");
		String desg=obj.nextLine();
		
		System.out.println("Enter Employee No :");
		int empno=obj.nextInt();				
		
		System.out.println("Enter Employee salary :");
		double  sal=obj.nextDouble();
		
		ta=0.05*sal;
		da=0.1*sal;
		hra=0.12*sal;
		ma=0.15*sal;
		tax=0.02*sal;
					
		double grossSalary = sal+ta+da+hra+ma;
		double netsal = grossSalary -tax;
		
		System.out.println("Employee No :"+empno);
		System.out.println("Employee Name :"+name);
		System.out.println("City :"+city);
		System.out.println("Designation :"+desg);
		System.out.println("Net salary :"+netsal);							
	}
    
}