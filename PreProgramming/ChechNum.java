package PreProgramming;
import java.util.Scanner;

public class ChechNum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the two numbers");
        int a = s.nextInt();
        int b = s.nextInt();
        int res = checkLarge(a,b);
        System.out.println("large Number is  "+res);


    }
    static int checkLarge(int a ,int b){
        int max = a>b?a:b;

        return max;
    }
    

    
}
