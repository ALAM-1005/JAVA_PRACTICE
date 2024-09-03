package ArrayProgram;

public class MinArray {
 
    static int sumOfArray(int[] x )
    
    {
        int sum = 0;

        for(int i=0;i<=x.length;i++){
            sum = sum+x[i];

 
        }
        return sum;
     }


     public static void main(String[]  args){

        int[] ar = {23,45,56,63,39};

        int sm = sumOfArray(ar);

        System.out.println(sm);



     }
}
