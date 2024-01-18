// Swap Two Number  

import java.util.Scanner;

class Swap 
{
	static void swap(int val1, int val2)
	{
		val1=val1-val2;
		val2=val1+val2;
		val1=val2-val1;

		System.out.println("\nFirst Number:"+val1);
		System.out.println("Second Number:"+val2);
	}

	public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		
		System.out.print("Enter First Number: ");
		int num1 = obj.nextInt();
		
		System.out.print("Enter Second Number: ");
		int num2 = obj.nextInt();

		swap(num1,num2);					
	}
}