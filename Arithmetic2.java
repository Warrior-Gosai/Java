// Arithmetic Operations On User inputed command line Value 

import java.util.Scanner;

class Arithmetic2 
{
	public static void main(String[] args) 
	{
		int num1=Integer.parseInt(args[0]);
		int num2=Integer.parseInt(args[1]);
				
		System.out.println("\nAddition : "+ num1+ " + "+num2+" = "+(num1+num2));
		System.out.println("Subtraction : "+ num1+ " - "+num2+" = "+(num1-num2)) ;
		System.out.println("Multiplication : "+ num1+ " * "+num2+" = "+(num1*num2)) ;
		System.out.println("Division : "+ num1+ " / "+num2+" = "+(num1/num2)) ;
	}
}