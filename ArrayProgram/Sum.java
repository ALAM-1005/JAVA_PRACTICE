package ArrayProgram;

import java.util.Scanner;

public class Sum {

    static int sumOfArray(int[] x){

        int sum =0;

        for(int i =0;i<x.length;i++){

            sum  = sum+x[i];

        }
        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of an Arrays  : ");

        int n = sc.nextInt();

        int[] ar = new int[n];

        System.out.print ("Enter"+n+"Values");

        for(int i =0;i<ar.length;i++){

            ar[i]  = sc.nextInt();
        }

        System.out.println("User entered Array Elements");

        for(int i = 0;i<ar.length;i++){

            System.out.print("["+ar[i]+"] ");
        }

        System.out.println();

        System.out.println("-----------------------------------------------");

        int sm = sumOfArray(ar);

        System.out.println("Sum of  element in array is :"+sm);
    }

    
    
}
