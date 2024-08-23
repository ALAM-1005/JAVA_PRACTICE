package PreProgramming;
import java.util.Scanner;

public class ProductNum {

     public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.println("Enter the Number ");

        
        
        int n = sc.nextInt();

        Product(n);

        System.out.println(Product(n));
     }

     static int Product(int n){
        int pro = 1;
        do{

            int rem  = n%10;

            pro*=rem;
            n/=10;

        }while(n!=0);
        return pro;
     }

    
}
