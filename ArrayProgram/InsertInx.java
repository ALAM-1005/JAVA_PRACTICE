package ArrayProgram;

public class InsertInx {

    static int[] insertArr(int[] x , int[] y,int in){

        if(in<0 || in>x.length)
        
            return null;

        int [] z = new int[x.length + y.length];

        for(int i = 0;i<y.length;i++){

            z[in+i]  = y[i];
        }

         for(int i= 0;i<x.length;i++){

            if(i<in)
                z[i] = x[i];
            else
                z[i+y.length] = x[i];
         }
         return y;
    }

    public static void main(String[] args) {


        int[] ar = {25,36,46,52,48,76};

        ar= insertEle(ar, 32, 2);

        if(ar == null)
          System.out.println("Insertion Failled");

        else
        {
            System.out.println("Inserted Arrays");


            for(int i=0;i<ar.length;i++){


                System.out.print(ar[i]+" ");


            }
        }
    }
    
}
