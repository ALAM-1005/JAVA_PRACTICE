package ArrayProgram;

import java.util.Scanner;

public class AverageArray {
    
    static int sumOfArray(int[] x){

        int sum =0;

        for(int i =0;i<x.length;i++){

            sum  = sum+x[i];


        }
        return sum;
    }
    static  double Average(int[] x){

        double sum  = 0.0;

        for(int i = 0;i<x.length;i++){

            sum = sum+x[i];
        }

        return sum/x.length;
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

        double Avg = Average(ar);

        System.out.println("Average of  element in array is :"+Avg);
    
    }

}
