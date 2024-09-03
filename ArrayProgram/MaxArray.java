package ArrayProgram;

import java.util.Scanner;

public class MaxArray {
    static int getSmallest(int[] x){

        int big = Integer.MIN_VALUE;

        for(int i = 0;i<x.length;i++){

            if ((x[i]>big)) {
                
                big = x[i];
            }

            
        }
        return big;
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
        System.out.println();

        System.out.println("-----------------------------------------------");

        int sm = getSmallest(ar);

        System.out.println("Smallest element in array is :"+sm);

    }
    
}
