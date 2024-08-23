package Programming;
import java.util.Scanner;
public class Arstrong {
    
    static int getFact(int n){
        int fact = 1;
        while(n>1){

            fact = fact*n;
            n--;
        }

        return fact;
    }
    

    static boolean isAmstrong(int n){

        int sum = 0; int temp = n;
        do{
            int d = n%10;

            sum = sum + getFact(n);

            n = n/10;

        }while(n!=0);

        return sum == temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    System.out.println("Emnter the nummber ");

        int n  =  sc.nextInt();

        System.out.println(isAmstrong(n));
    }
}
