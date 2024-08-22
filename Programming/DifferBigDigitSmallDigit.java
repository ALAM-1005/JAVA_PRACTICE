package Programming;

import java.util.Scanner;

public class DifferBigDigitSmallDigit {

    public static int getDifferenceBetweenMaxAndMin(int number) {
        int maxDigit = getMaxDigit(number);
        int minDigit = getMinDigit(number);
        return maxDigit - minDigit;
    }
    
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number ");

        int number = sc.nextInt();

        System.out.println("The biggest digit is :"+getMaxDigit(number));
}
    
}
