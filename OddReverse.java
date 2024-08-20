/**
 * Define a method to display Odd Number b/w the limits(user Enter Number ) in reverse order.
 * 
 */

import java.util.Scanner;

public class OddReverse {
    
     public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);

        System.out.println(" enter the number");

        int a = sc.nextInt() ;

        int b = sc.nextInt();
        System.out.println("-------------");

        // for(int i=a;i<=b;i++)
        for(;b>=a;b--)
        {

            if(b%2 == 1)
            System.out.println(b+" odd");
        }

    }
}
