package NumberSystem;

import java.util.Scanner;

public class Happy {

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
        
        
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number");

        int n = sc.nextInt();

        boolean rs = isHappy(n);

        if (rs) {
            System.out.println(n+"is a Happy Number");
        }
        else{
            System.out.println(n+"is not a happy Number");
        }
    }
    
    
}
