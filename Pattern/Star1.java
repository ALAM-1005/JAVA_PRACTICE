package Pattern;
import java.util.Scanner;

/**
 * Star  programming of start petter design
 */
public class Star1 {
public static void main(String[] args) {
    Scanner sc  = new Scanner (System.in);

    System.out.println("Enter the number");

    int n = sc.nextInt();

    for(int i=1;i<=n;i++){

        System.out.println("*");
    }

    sc.close();
}
    
}