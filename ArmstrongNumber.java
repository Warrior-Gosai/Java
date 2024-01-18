//Armstrong Number 
//1634

import java.util.Scanner;

class ArmstrongNumber 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (isArmstrongNumber(num)) 
        {
            System.out.println(num + " is an Armstrong number.");
        } 
        else 
        {
            System.out.println(num + " is not an Armstrong number.");
        }
    }

    boolean isArmstrongNumber(int num) 
    {
        int originalNum = num;
        int result = 0;
        int n = String.valueOf(num).length();

        while (num > 0) 
        {
            int digit = num % 10;
            result = result + Math.pow(digit, n);
            num = num / 10;
        }

        return originalNum == result;
    }
}