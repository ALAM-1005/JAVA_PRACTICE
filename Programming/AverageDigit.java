package Programming;

import java.util.Scanner;

public class AverageDigit {


    public static double getAverageOfDigits(int number) {
        int sum = 0;
        int count = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            count++;
            number /= 10;
        }
        return (double) sum / count;
    }
    
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number ");

        int number = sc.nextInt();

        System.out.println("The Average digit is :"+getAverageOfDigits(number));
}
    
}
