package Pattern;
import java.util.Scanner;

public class Star1 {
		public static void main(String[] args) {
			
			
		    Scanner sc  = new Scanner (System.in);

		    System.out.println("Enter the number");

		    int n = sc.nextInt();

		    for(int i=1;i<=n;i++){
		        System.out.print("*"+" ");  // one line print
		    }

		    sc.close();
		
		}
		}
		    
