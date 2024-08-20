/**
 * DAFTF the product of n natural number
 * 
 */


import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.println("Enter the Number ");

        
        
        int n = sc.nextInt();

        factorial(n);
        System.out.println(factorial(n));


    }
    static int factorial(int n){

        int fact = n;

        for(int i=2;i<n;i++){

            fact *= i;
        }
        return fact;
    }
}
