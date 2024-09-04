package ArrayProgram;

public class AverageArray {


    static int sumOfArray(int[] x){

        int sum =0;

        for(int i =0;i<x.length;i++){

            sum  = sum+x[i];


        }
        return sum;
    }
    static  double Average(int[] x){

        double sum  = 0.0;

        for(int i = 0;i<x.length;i++){

            sum = sum+x[i];
        }

        return sum/x.length;
    }
    
}
