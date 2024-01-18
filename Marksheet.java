import java.util.Scanner;

public class Marksheet{
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter Mark of Java :");
		int s1 = obj.nextInt();
		
		System.out.println("Enter Mark of Networking:");
		int s2 = obj.nextInt();
		
		System.out.println("Enter Mark of Oracle :");
		int s3 = obj.nextInt();
		
		int total = s1+s2+s3;
		float per = total/3;
		
		System.out.println("Total Mark :" +total);
	    System.out.println("Percentage :" +per);
	}
}