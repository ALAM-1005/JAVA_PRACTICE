package _2DArray;

public class RowWiserev {
    

    static int[][] rowWiseRev(int [][] mat){

        for(int i =0;i<mat.length;i++){

            int l =0, h = mat[i].length -1;

            while (l<h) {

                int temp = mat[i][l];
                mat[i][l] = mat[i][h];
                mat[i][h] = temp;

                l++;
                h--;
            }
        }
            return mat;
    }


}
