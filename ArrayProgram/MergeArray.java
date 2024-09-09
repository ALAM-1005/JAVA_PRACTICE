package ArrayProgram;

public class MergeArray {

    static int merge(int[]x,int[]y){
        int[] z = new int [x.length + y.length];

        for(int i = 0;i<x.length;i++){

            z[i] = x[i];
        }

        for(int i =0;i<y.length;i++){

            z[x.length + i] = y[i];
        }

        return z;

    }

    public static void main(String[] args) {
        int[] a = {25,56,98,45,12,54};

        int [] b = {78,10,25};

        int[] c = merge(a,b);

        for(int i=0;i<c.length;i++){


            System.out.println(c[i]+" ");
        }
    }
    
}
