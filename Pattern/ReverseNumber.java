package Pattern;

import java.util.Scanner;

public class ReverseNumber {

     public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");

        int n  = sc.nextInt();

        for(int i =0;i<n;i++){  // number = no of lines
            
            for(int j =n;j>0;j--) {

            System.out.print(j+" "); //number in reverse

        }

        System.out.println();

    }
}
    
}
