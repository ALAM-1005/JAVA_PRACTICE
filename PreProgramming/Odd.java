package PreProgramming;
/**
 * Define a method to display Odd Number b/w the limits(user Enter Number )
 * 
 */

 import java.util.Scanner;

class Odd {

    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);

        System.out.println(" enter the number");

        int a = sc.nextInt() ;

        int b = sc.nextInt();
        System.out.println("-------------");

        // for(int i=a;i<=b;i++)
        for(;a<=b;a++)         
        {

            if(a%2 == 1)
            System.out.println(a+" ODD ");
        }

    }
}