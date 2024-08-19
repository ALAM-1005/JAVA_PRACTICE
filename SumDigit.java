import java.util.Scanner;

public class SumDigit {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.println("Enter the Number ");

        
        
        int n = sc.nextInt();

        sumDigit(n);

        System.out.println(sumDigit(n));


    }

    static int sumDigit(int n){

        int sum = 0;

        do{

            sum += n%10;

            n = n/10;

        }while(n!=0);

        return sum;
    }
    
}
