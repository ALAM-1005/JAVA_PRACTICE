package ArrayProgram;

public class MergeArr {

    static int[] merge(int[]x,int[] y){
        
        int[] z = new int[x.length + y.length];

        for(int i =0;i<x.length;i++){

            z[i] = x[i];
        }

        for(int i= 0;i<y.length;i++){

            z[x.length+i] = y[i];
        }
    return z;
    }


    public static void main(String[] args) {
        

        int[] a = {25,35,56,47,87,98,65,41};
        int[]  b ={22,32,45,74,10};

        int[] c = merge(a,b);

        for(int i =0;i<c.length;i++){

            System.out.print(c[i]+" ");
        }
    System.out.println();


    }
    
}
