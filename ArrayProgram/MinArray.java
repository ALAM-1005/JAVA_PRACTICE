package ArrayProgram;

public class MinArray {

    static int getSmallest(int[] x){

        int small = Integer.MAX_VALUE;
        
        for(int i = 0;i<x.length;i++){

            if ((x[i]<small)) {
                
                small = x[i];
            }

            return small;
        }
    }
    
}
