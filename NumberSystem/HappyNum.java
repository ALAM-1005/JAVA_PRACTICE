package NumberSystem;

import java.util.Scanner;

public class HappyNum {

    

    static boolean isHappy(int n){

        while(n>9){

            int sum= 0;

            do{
                int d = n%10;

                sum  = sum+d*d;

            }while(n!=0);

           return  n==sum;
        }

        return n == 1 || n== 7;
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
