package Programming;

import java.util.Scanner;

public class SmallestDigit {


    public static int getMinDigit(int number) {
        int minDigit = 9;
        while (number > 0) {
            int digit = number % 10;
            if (digit < minDigit) {
                minDigit = digit;
            }
            number /= 10;
        }
        return minDigit;
    }
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number ");

        int number = sc.nextInt();

        System.out.println("The Smallest digit is :"+getMinDigit(number));
}
    
}
