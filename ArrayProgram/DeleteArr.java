package ArrayProgram;

public class DeleteArr {

    static int[] DeleteEle(int[] x , int ele,int in){

        if(in<0 || in>=x.length)
        
            return null;

        int [] y = new int[x.length - 1];

       

         for(int i= 0;i<x.length - 1;i++){

            if(i < in)
                y[i] = x[i];
            else
                y[i+1] = x[i];
         }
         return y;
    }

    public static void main(String[] args) {


        int[] ar = {25,36,46,52,48,76};

        ar= DeleteEle(ar, 2);

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
