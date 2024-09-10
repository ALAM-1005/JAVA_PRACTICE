package ArrayProgram;

public class Reversearrays {


    static void reverseArr(int[] x){

        int f =0, l = x.length -1;
        while (f<l) {
            
            int temp = x[f];

            x[f] = x[l];

            f++;
            l--;
        }
    }
    public static void main(String[] args) {
        

        int[]  ar = {12,25,56,48,79};
        reverseArr(ar);

        for(int i = 0;i<ar.length;i++){

            System.out.println(ar[i]+ " ");
        }
    }
    
}
