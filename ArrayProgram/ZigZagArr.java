package ArrayProgram;

public class ZigZagArr {

    static int[] zigZag(int[] a,int[] b){



        int[] c = new int[a.length + b.length ];

        
        int i =0, j=0, k=0;

        while (i<a.length  && j<b.length) {
            
            c[k++] = a[i++];

            c[k++] = b[j++];
        }

        while(i<a.length){

            c[k++] = a[i++];
        }

        while(i<b.length){

            c[k++] = b[j++];
        }

    return c;

    }


    public static void main(String[] args) {
        
        int[] a = {25,35,56,47,87,98,65,41};

        int[]  b ={22,32,45,74,10};

        int[] c = zigZag(a,b);  // every arrays elements one by one strore

        for(int i =0;i<c.length;i++){

            System.out.print(c[i]+" ");
        }
     System.out.println();


    }
    
}
