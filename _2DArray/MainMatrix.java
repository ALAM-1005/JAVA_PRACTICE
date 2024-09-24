package _2DArray;

public class MainMatrix {
    
    public static void main(String[] args) {

        Matrix mt = new Matrix ();
       System.out.println("Read first Matrix");
       int[][] a = mt.readMat();
       System.out.println("Read Second Matrix");
       int[][] b = mt.readMat();
       System.out.println("user Entered first matrix");    
       mt.dispMat(a);
       System.out.println("user Entered Second matrix");
       mt.dispMat (b);


       int[][] c = mt.addMat(a,b);

       if (c== null)

         System.out.println("addition failled");

      else
 
     { 
       System.out.println("Added Matrix: ");
       mt.dispMat (c);
     }



    }
}
