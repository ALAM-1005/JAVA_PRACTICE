package ArrayProgram;

public class SumEO {

    static int[] sumOfEO(int[] x){

        int es=0,os = 0;

        for(int i =0;i<x.length;i++){
            if (x[i]%2 == 0)
                    es = es+x[i];
            else
                    os = os+x[i];
        }

        int [] sum = {es,os}; 

        return sum;
    }
    

    
}
