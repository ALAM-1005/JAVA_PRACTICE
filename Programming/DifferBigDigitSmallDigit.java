package Programming;

import java.util.Scanner;

public class DifferBigDigitSmallDigit {

        // static method starts here
        public static int getMaxDigit(int number) {
            int maxDigit = 0;  // Assume the maximum number is zero.
            while (number > 0) {
                int digit = number % 10;  // here we get the remonder means  last digit 
                if (digit > maxDigit) {
                    maxDigit = digit;
                }
                number /= 10;
            }
            return maxDigit;  // return statement 
        }

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




    public static int getDiffMaxAndMin(int number) {
        int maxDigit = getMaxDigit(number);
        int minDigit = getMinDigit(number);
        return maxDigit - minDigit;
    }
    
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number ");

        int number = sc.nextInt();

        System.out.println("The biggest digit is :"+getDiffMaxAndMin(number));
}
    
}
