package Programming;

import java.util.Scanner;

public class DifferEvenOdd {

    public static int DiffEvneOdd(int number) {
        int evenSum = 0;
        int oddSum = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                evenSum += digit;
            } else {
                oddSum += digit;
            }
            number /= 10;
        }
        return evenSum - oddSum;
    }
    
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number ");

        int number = sc.nextInt();

        System.out.println("The Difference digit of Even and Odd  is :"+DiffEvneOdd(number));
}
}
