/**
 * DAMTF first and Last digit sumation and in between digit Sumation.
 * 
 */
import java.util.Scanner;

public class DigitSumation {
    public static void main(String[] args) {
        

        Scanner sc =new Scanner(System.in);

        int n = sc.nextInt();


        int flSum = n%10;
        int midSum = 0;
        n = n/10;

        
        
        while(n/10 != 0){

            int rem = n%10;

            midSum += rem;

            n/=10;
        }

        flSum = flSum+n;
        System.out.println(flSum);
        System.out.println(midSum);
    }
    
}
