package PreProgramming;
import java.util.Scanner;

// This Program to Check Greater Number among three Number


public class LargeNum {
     public static void main(String[] args) {
        Scanner s = new Scanner(System.in);    // Scanner Pre defined used to take input by user
        System.out.println("Enter the three numbers");   // print  statement
        int a = s.nextInt();    // pass the refrence variable
        int b = s.nextInt();
        int c = s.nextInt();
        int max = checkLarge(a,b,c);
        System.out.println("large Number is  "+max);


    }
    static int checkLarge(int a ,int b,int c){   // here Static methods used by static keyword
        int max = a>b && a>c?a:(b>c?b:c);

        return max;
    }

    
}
