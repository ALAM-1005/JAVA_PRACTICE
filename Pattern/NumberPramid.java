package Pattern;
import java.util.Scanner;
public class NumberPramid {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Number");
        int n = sc.nextInt();

        for(int line =1;line<=n;line++){

            for(int number = 1;number<=line;number++){

                System.out.print(number);
            }
            System.out.println();
        }
        

        
    }
   
    
}
