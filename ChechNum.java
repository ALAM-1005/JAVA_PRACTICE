import java.util.Scanner;

public class ChechNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int res = checkLarge(a,b);
        System.out.println("large Number is  "+res);50
        

    }
    static int checkLarge(int a ,int b){
        int max = a>b?a:b;

        return max;
    }
    

    
}
