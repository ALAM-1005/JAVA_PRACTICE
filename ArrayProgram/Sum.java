package ArrayProgram;

public class Sum {

    static int sumOfArray(int[] x){

        int sum =0;

        for(int i =0;i<x.length;i++){

            sum  = sum+x[i];

        }
        return sum;
    }
    
}
