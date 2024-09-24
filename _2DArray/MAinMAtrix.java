package _2DArray;

public class MAinMAtrix {
    

    public static void main(String[] args) {

        Matrix mt = new Matrix();
        
        System.out.println("read first Matrix");
        
        int[][]a=mt.readMat();
        
        System.out.println("user entered matrix"); 
        mt.dispMat(a);
        
        int[] rs = SumRowColumn.rowWiseSum(a);
        
        for (int i=0; i<rs.length; i++)
        
        {
        
        System.out.println(i+1+" row sum is: " +rs[i]);
        }

        int[] cs = SumRowColumn.columnWiseSum(a);
        
        for(int i=0; i<cs.length; i++)
        
        { 
            System.out.println(i+1+" column sum is "+cs[i]);
        
        }
    }
}

