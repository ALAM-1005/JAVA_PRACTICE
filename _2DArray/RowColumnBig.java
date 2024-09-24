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

    
}
