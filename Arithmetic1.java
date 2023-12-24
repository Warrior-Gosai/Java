// Arithmetic Operations On User inputed Value 

import java.util.Scanner;

class Arithmetic1 {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		System.out.print("Enter First Number: ");
		int num1 = obj.nextInt();
		
		System.out.print("Enter Second Number: ");
		int num2 = obj.nextInt();
		
		//int ans = num1+num2;
		
		System.out.println("\nAddition : "+ num1+ " + "+num2+" = "+(num1+num2)) ;
		System.out.println("Subtraction : "+ num1+ " - "+num2+" = "+(num1-num2)) ;
		System.out.println("Multiplication : "+ num1+ " * "+num2+" = "+(num1*num2)) ;
		System.out.println("Division : "+ num1+ " / "+num2+" = "+(num1/num2)) ;
	}
}