package NumberSystem;
import java.util.Scanner;

/**
 * PerfectNum
 */
public class PerfectNum {

    static boolean isPerfect(int n){

        int sum = 0;
        for(int i=1;i<=n/2;i++){

            if(n%i == 0){
                sum = sum+i;
            }
        }

        return sum ==n;
    }


    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        int n = scan.nextInt();

        boolean rs = isPerfect(n);

        if (rs) {

            System.out.println(n+"   is a perfect Number");
            
        }
        else{
            System.out.println("is not a perfect number");
        }

        // for(int i =1;i<=100;i++){
        //     if(isPerfect(i)){
        //         System.out.println(i+" ");
        //     }
       
        // }


    }
}
    

