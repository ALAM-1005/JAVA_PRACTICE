package Pattern;

import java.util.Scanner;

public class AtoZ {

     public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter  the Number");

        int n = sc.nextInt();

        int k =1;

        for(int i = 1;i<=n;i++){

            for(int j =1;j<=n;j++){

                 System.out.print((char)(k+64)+" ");

                k++;

                if (k == 27) {
                    
                    k =1;
                }
            }
            
            System.out.println();
        }
    }
    
}
