package ArrayProgram;
import java.util.Scanner;
public class DbleTypeArray {
    static double getSmallest(double[] x){

        int small = Integer.MAX_VALUE;

        for(int i = 0;i<x.length;i++){

            if ((x[i]<small)) {
                
                small = x[i];
            }

            
        }
        return small;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of an Arrays  : ");

       int n = sc.nextInt();

    //    double m = sc.nextDouble();

        double[] ar = new double[n];

        System.out.println ("Enter"+n+"Values");

        for(int i =0;i<ar.length;i++){

            ar[i]  = sc.nextDouble();
        }

        System.out.println("User entered Array Elements");

        for(int i = 0;i<ar.length;i++){

            System.out.print(ar[i]+"  ");
        }
        System.out.println();

        System.out.println("-----------------------------------------------");

        double sm = getSmallest(ar);

        System.out.println("Smallest element in array is :"+sm);

    }
    
}

    


    
}
