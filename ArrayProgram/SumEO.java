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


    public static void main(String[] args) {
        
        int[] ar = {23,45,36,57,76};

        int[] sm = sumOfEO(ar);

        System.out.println("Sum of Even Number "+sm[0]);
        System.out.println("Sum of Odd Number "+sm[1]);
    }

    
}
