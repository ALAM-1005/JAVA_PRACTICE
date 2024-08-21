
 /**
 * Define a method to find sumation of  Factors of given Number.
 */

import java.util.Scanner;

public class FactSum {

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

      
        System.out.println("Enter the Number ");

        int n = sc.nextInt();

        fact(n);

        System.out.println();
     }

     static void fact(int n){
        
        for(int i= 1;i<=n;i++){
            int Sum = 0;
            
            if (n%i == 0) {

                

                Sum += i;
            }
            System.out.println(Sum);
        } 

     }
    
}


