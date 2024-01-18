import java.util.Scanner;

class SumOfDigits 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int sum = SumOfDigits(number);

        System.out.println("Sum of digits of " + number + " is: " + sum);
    }

    static int SumOfDigits(int num) 
    {
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
  
        return sum;
    }
}