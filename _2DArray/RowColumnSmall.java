package _2DArray;

public class RowColumnSmall {
    
    static int[] rowWiseSmallest(int[][] mat) {
        int[] small = new int[mat.length]; 

        for (int i = 0; i < mat.length; i++) {
            int min = mat[i][0];  

            for (int j = 1; j < mat[i].length; j++) {


                if (mat[i][j] < min) {

                    min = mat[i][j];  
                }
            }

            small[i] = min; 
        }

        return small;
}
    static int[] columnWiseSmallest(int[][] mat) {


        int[] small = new int[mat[0].length];  

        for (int i = 0; i < mat[0].length; i++) {

            int min = mat[0][i];  

            for (int j = 0; j < mat.length; j++) {

                if (mat[j][i] < min) {

                    min = mat[j][i]; 
                }
            }

            small[i] = min; 
        }

    return small;

    }

    public static void main(String[] args) {

        Matrix mt = new Matrix();
        
        System.out.println("read first Matrix");
        
        int[][]a=mt.readMat();
        
        System.out.println("user entered matrix"); 
        mt.dispMat(a);
        
        int[] rs = rowWiseSmallest(a);
        
        for (int i=0; i<rs.length; i++)
        
        {
        
        System.out.println(i+1+" RowWise smallest element is: " +rs[i]);
        }

        int[] cs =columnWiseSmallest(a);
        
        for(int i=0; i<cs.length; i++)
        
        { 
            System.out.println(i+1+" columnWise smallest elemrnts is "+cs[i]);
        
        }
    }
}