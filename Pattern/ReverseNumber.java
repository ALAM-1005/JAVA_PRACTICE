package Pattern;

import java.util.Scanner;

public class ReverseNumber {

     public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");

        int n  = sc.nextInt();

        for(int i =0;i<=n;i++){

            for(int j =n-1;j>=0;j--) {

            System.out.print(j+" ");

        }

        System.out.println();

    }
}
    
}
