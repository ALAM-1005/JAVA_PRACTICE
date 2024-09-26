package _2DArray;
public class SolRwCwRev {
    public static void main(String[] args) {

        RowWiserev obj = new RowWiserev();
        
        System.out.println("read first Matrix");
        
        int[][]a=Matrix.readMat();
        
        System.out.println("user entered matrix"); 
        Matrix.dispMat(a);

       int [] rs = RowWiserev.rowWiseRev(a);
            matrix.dispMat(rs);
    }
}
