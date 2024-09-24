package _2DArray;

public class MainMat {
    

    public static void main(String[] args) {

        Matrix mt = new Matrix();
        
        System.out.println("read first Matrix");
        
        int[][]a=mt.readMat();
        
        System.out.println("user entered matrix"); 
        mt.dispMat(a);
        
        int[] rs = RowColumnBig.rowWiseBiggest(a);
        
        for (int i=0; i<rs.length; i++)
        
        {
        
        System.out.println(i+1+" RowWise biggest element is: " +rs[i]);
        }

        int[] cs = RowColumnBig.columnWiseBiggest(a);
        
        for(int i=0; i<cs.length; i++)
        
        { 
            System.out.println(i+1+" columnWise Biggest elemrnts is "+cs[i]);
        
        }
    }
}
