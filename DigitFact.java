/**
 * Write a java program factorial each digit in given number.
 */

import java.util.Scanner;

public class DigitFact {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

      
        System.out.println("Enter the Number ");

        int n = sc.nextInt();

        accessDigit(n);

        System.out.println();
     }

     static void accessDigit(int n){

        do{

            int rem = n%10;
            fact(rem);
            n/=10;


        }while(n!=0);
     }

     static void fact(int n){
        int fact = n;
        for(int i =2;i<n;i++){
            fact *= i;
        }

        System.out.println("fact of "+n+" is "+fact);
     }
    
}
