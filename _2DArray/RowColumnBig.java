package _2DArray;

public class RowColumnBig {
    

    static int[] rowWiseBiggest(int[][] mat){

        int[] big = new int [mat.length];

        for (int i=0; i< mat. length; i++) {

        int max = mat [i][0];

        for(int j=1;j<mat [i].length; j++)

        { 
            if (mat [i][j]> max)

            max = mat [i][j];

        }

        big[i] = max;
    }
    return big;

}

static int[] columnWiseBiggest (int[][] mat){

int[] big = new int [mat[0].length];

for (int i=0; i< mat[0].length; i++){

      int max = mat [0][i];
    for (int j=0; j<mat.length; j++)

        { 
                if (mat[j][i]>max)
                max = mat[j][i];
        }
    big [i] = max;

    }

    return big;

    }

    public static void main(String[] args) {

        Matrix mt = new Matrix();
        
        System.out.println("read first Matrix");
        
        int[][]a=mt.readMat();
        
        System.out.println("user entered matrix"); 
        mt.dispMat(a);
        
        int[] rs = rowWiseBiggest(a);
        
        for (int i=0; i<rs.length; i++)
        
        {
        
        System.out.println(i+1+" row sum is: " +rs[i]);
        }

        int[] cs =columnWiseBiggest(a);
        
        for(int i=0; i<cs.length; i++)
        
        { 
            System.out.println(i+1+" column sum is "+cs[i]);
        
        }
    }
}
