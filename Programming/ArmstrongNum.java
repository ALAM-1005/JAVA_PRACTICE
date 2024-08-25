package Programming;

import java.util.Scanner;

public class ArmstrongNum {

    static int getPow(int n,int p){

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int rs = isAmstrongNum(n);

        if(rs){
            System.out.println(n+"is a Amstrong Number");
        }

        else{
            System.out.println(n+"is not a ArmstrongNumber");
        }

    }
    
}
