package ArrayProgram;

public class InsertArr {

    static int[] insertEle(int[] x , int ele,int in){

        if(in<0 || in>x.length)
            return null;

        int [] y = new int[x.length + 1];
         y[in] = ele;

         for(int i= 0;i<x.length;i++){

            if(i<in)
                y[i] = x[i];
            else
                y[i+1] = x[i];
         }
         return y;
    }
    
}
