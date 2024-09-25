package _2DArray;
import java.util.Scanner;


public class Matrix {


  static int[][] readMat () {
  Scanner sc = new Scanner(System.in);
  System.out.println();
  System.out.println("enter the order of a matrix");
  int row=sc.nextInt();
  int col=sc.nextInt();
  int[][] mat = new int [row] [col]; 
  System.out.println("enter" + row * col+" values");

    for (int i=0; i<mat.length; i++)
    {
         for (int j=0;j< mat[i].length;j++)
        {
         mat [i][j] = sc.nextInt();
        }
    }

    return mat;
  }
public static void dispMat (int[][] mat)
{

    for (int i=0;i<mat.length; i++)

    { 
        for (int j=0; j <mat[i].length; j++) { 

            System.out.print(mat[i][j]+" ");
    }
    System.out.println();
    }
}


public int[][] addMat (int[][] X, int[][] Y)

{ 
    if (X.length!=Y.length||X[0].length!=Y[0].length)
                return null;

    int[][] z =new int [X.length][X[0].length];

    for(int i=0; i<z.length; i++) {

        for (int j=0; j<z[i].length; j++)

        z[1][j]=X[i][j] + Y[i][j];
}
return z;
}

}
