package ArrayProgram;
import java.util.Scanner;
public class DoubleTypeArray {
    static double getbiggest(double[] x){

        double big = Integer.MIN_VALUE;

        for(int i = 0;i<x.length;i++){

            if ((x[i]>big)) {
                
                big = x[i];
            }

            
        }
        return big;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of an Arrays  : ");

        double n = sc.nextDouble();

        double[] ar = new double[n];

        System.out.println ("Enter"+n+"Values");

        for(int i =0;i<ar.length;i++){

            ar[i]  = sc.nextInt();
        }

        System.out.println("User entered Array Elements");

        for(int i = 0;i<ar.length;i++){

            System.out.print(ar[i]+"  ");
        }
        System.out.println();

        System.out.println("-----------------------------------------------");

        double sm = getbiggest(ar);

        System.out.println("Smallest element in array is :"+sm);

    }
    
}

    

