package PreProgramming;
import java.util.Scanner;

/**
 * Define a method to display each digit in the given Number.
 */
public class Digit {

     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter the number");

        int n = input.nextInt();

        while (n!=0) {

            int rem = n%10;
            System.out.println(rem);

            n = n/10;
            
        }
     }
}