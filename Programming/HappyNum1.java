package Programming;

import java.util.Scanner;

public class HappyNum1 {

    static int countHappy(int n){

        int count = 0;

        for(int i =1;i<=n;i++){

            boolean rs = isHappy(n);
            if (rs) {
               count++; 
            }
        }
         return count;
    }

    static boolean isHappy(int n){

        while (n>9) {

            n = sumOfSquareOfDigits(n);
            
        }
        return n==1 || n==7;
    }
    static int sumOfSquareOfDigits(int x){
       int sum = 0;
        while (x!=0) {
            int d = x%10;
            sum = sum+d*d;
            x= x/10;           
        }
        return sum;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the Number");
        int n =  scan.nextInt();

        int hc = countHappy(n);

        System.out.println("No of happy NUmber with in "+n+"is"+hc);

    }
    
    
}
