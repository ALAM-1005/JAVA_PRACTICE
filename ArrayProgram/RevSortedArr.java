package ArrayProgram;

public class RevSortedArr {

    static int[] revMergeSort(int[] a,int[] b){

        int[] c = new int[a.length + b.length ];

        int i =a.length-1, j=b.length -1,k=0;

        while (i>=0 && j>=0) {

            if(a[i] > b[j])
                c[k++] = a[i--];
            else
                c[k++] = b[j--];
        }

        while(i>=0){

            c[k++] = a[i--];
        }

        while(j>=0){

            c[k++] = b[j--];
        }

    return c;

    }


    public static void main(String[] args) {
        
        int[] a = {25,35,47,56,75,95};

        int[]  b ={22,32,45,74};

        int[] c = revMergeSort(a,b);  // every arrays elements one by one strore

        for(int i =0;i<c.length;i++){

            System.out.print(c[i]+" ");
        }
     System.out.println();


    }
    
}
