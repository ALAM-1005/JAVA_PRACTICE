package _2DArray;

public class RowWiserev {
    

    void rowWiseRev(int [][] mat){

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
    }

    public static void main(String[] args) {

        Matrix mt = new Matrix();
        
        System.out.println("read first Matrix");
        
        int[][]a=mt.readMat();
        
        System.out.println("user entered matrix"); 
        mt.dispMat(a);

         mt.rowWiseRev(a);
    }
}
