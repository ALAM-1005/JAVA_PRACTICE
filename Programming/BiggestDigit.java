package Programming;

import java.util.Scanner;

public class BiggestDigit {

    public static int getMaxDigit(int number) {
        int maxDigit = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit > maxDigit) {
                maxDigit = digit;
            }
            number /= 10;
        }
        return maxDigit;
    }
    


    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number ");

        int number = sc.nextInt();

        System.out.println(""+getMaxDigit(number));
}
    

}
