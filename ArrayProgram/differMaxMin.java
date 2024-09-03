package ArrayProgram;
import java.util.*;

public class differMaxMin {

    static int differenceMinMax(int []x){

        return MaxArray.getbiggest(x) - MinArray.getSmallest(x);
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of an Arrays  : ");

        int n = sc.nextInt();

        int[] ar = new int[n];

        System.out.print ("Enter"+n+"Values");

        for(int i =0;i<ar.length;i++){

            ar[i]  = sc.nextInt();
        }

        System.out.println("User entered Array Elements");

        for(int i = 0;i<ar.length;i++){

            System.out.print("["+ar[i]+"] ");
        }
        System.out.println();

        System.out.println("-----------------------------------------------");

        int diff = differenceMinMax(ar);

        System.out.println("Smallest element in array is :"+diff);



    }



    

}
