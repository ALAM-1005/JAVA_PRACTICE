package Programming;

import java.util.Scanner;

public class DisariumNum {
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

    

    static boolean isDisariumNum(int n){
        int sum= 0,temp =n;
        int count =  getNoOfDigits(n);
        do{

            int d = n%10;
            sum= sum+getPow(d, count);
            count--;
            n/=10;
        }while(n!=0);
        return sum == temp;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the Number");

        int n = scan.nextInt();

        boolean rs = isDisariumNum(n);

        if(rs){
            System.out.println(n+"   is a Disarium  Number");
        }

        else{
            System.out.println(n+"  is not a Disarium  Number");
        }

    }
    
}
