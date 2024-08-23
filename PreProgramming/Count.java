package PreProgramming;
/**
 * DAMT count no.of digit in the given Number
 */

import java.util.Scanner;

public class Count {
    
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.println("Enter the Number ");

        
        
        int n = sc.nextInt();

        CountNo(n);


    }
    static void CountNo(int n){

        int Count = 0;
        do{
            Count++;
            n/=10;
        }while(n!=0);

        System.out.println("Count  Of Digit is :"+Count);
    }

    
}
