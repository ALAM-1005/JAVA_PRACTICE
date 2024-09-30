package ArrayProgram;

public class SumE {
    

    static int sum(int[] x){

        int sum  =0;

        for(int i =0; i<x.length;i++){

            if(i%2 == 0){  

                sum = sum + x[i];
            }
        }
        return sum;
    } 


    public static void main(String[] args) {
       
        
        int[] ar = { 0,1 ,3,4,5,6};   

        int sm = sum(ar);

       System.out.println(sm);
    }
}
