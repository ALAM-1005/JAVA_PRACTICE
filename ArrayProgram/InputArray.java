package ArrayProgram;

import java.util.Scanner;

public class InputArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of an Arrays  : ");

        int n = sc.nextInt();

        int[] ar = new int[n];

        System.out.println("Enter"+n+"Values");

        for(int i =0;i<ar.length;i++){

            ar[i]  = sc.nextInt();
        }

        System.out.println("User entered Array Elements");

        for(int i = 0;i<ar.length;i++){

            System.out.print("["+ar[i]+"] ");
        }
    }
    
}
