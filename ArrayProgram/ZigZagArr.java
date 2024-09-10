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



    }
    
}
