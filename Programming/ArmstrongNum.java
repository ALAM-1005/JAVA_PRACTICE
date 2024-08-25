package Programming;

import java.util.Scanner;

public class ArmstrongNum {

    static int getPow(int n,int p){

        int prod = 1;
        while (p>0) {

             prod = prod*n;
            p--;
        }
        return prod;

    }

    static int getNoOfDigits(int n){
        int count = 0;

        do{
            count ++;
            n/=10;
        }while(n!=0);
        return count;
    }

    

    static boolean isAmstrongNum(int n){
        int sum= 0,temp =n;
        int count =  getNoOfDigits(n);
        do{

            int d = n%10;
            sum= sum+getPow(d, count);
            n/=10;
        }while(n!=0);
        return sum == temp;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        boolean rs = isAmstrongNum(n);

        if(rs){
            System.out.println(n+"is a Amstrong Number");
        }

        else{
            System.out.println(n+"is not a ArmstrongNumber");
        }

    }
    
}
