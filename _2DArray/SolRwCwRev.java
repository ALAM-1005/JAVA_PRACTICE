package _2DArray;
public class SolRwCwRev {
    public static void main(String[] args) {

        RowWiserev obj = new RowWiserev();
        
        System.out.println("read first Matrix");
        
        int[][]a=Matrix.readMat();
        
        System.out.println("user entered matrix"); 
        Matrix.dispMat(a);

        RowWiserev.rowWiseRev(a);

        for(int i =0;i<a.length;i++){

                System.out.println(a[i]);
            }
    }
}
