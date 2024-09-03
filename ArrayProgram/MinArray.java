package ArrayProgram;

import java.util.Scanner;

public class MinArray {

    static int getSmallest(int[] x){

        int small = Integer.MAX_VALUE;

        for(int i = 0;i<x.length;i++){

            if ((x[i]<small)) {
                
                small = x[i];
            }

            
        }
        return small;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of an Arrays  : ");

        int n = sc.nextInt();

        int[] ar = new int[n];

        System.out.println ("Enter"+n+"Values");

        for(int i =0;i<ar.length;i++){

            ar[i]  = sc.nextInt();
        }

        System.out.println("User entered Array Elements");

        for(int i = 0;i<ar.length;i++){

            System.out.print(ar[i]+"  ");
        }


        System.out.println("-----------------------------------------------");

        int sm = getSmallest(ar);

        System.out.println("Smallest element in array is :"+sm);

    }

   
    
}
