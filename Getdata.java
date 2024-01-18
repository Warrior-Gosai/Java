// Get Data Using system.in class and display with system.out 
import java.util.Scanner;

class Getdata 
{
	public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		
		System.out.print("Enter Your Roll no : ");
		int rno = obj.nextInt();				
		
		obj.nextLine();			

		System.out.print("Enter Your Name : ");
		String name = obj.nextLine();
		
		System.out.print("Enter Your Marks : ");
		double mark = obj.nextDouble();
		
		System.out.println("Roll No : "+rno);
		System.out.println("Name : "+name);
		System.out.println("Marks : "+mark);
	}
}