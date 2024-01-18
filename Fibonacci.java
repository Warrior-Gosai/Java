// Fibonacci Series 

import java.util.*;

class Fibonacci 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n= scanner.nextInt();
  
        FibonacciSeries(n);
    }

    static  void FibonacciSeries(int n) 
    {
        int firstTerm = 0, secondTerm = 1;

        System.out.println("Fibonacci Series:");

        for (int i = 0; i < n; i++) 
        {
            System.out.print(firstTerm + " ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
