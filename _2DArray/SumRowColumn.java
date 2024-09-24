package _2DArray;

public class SumRowColumn {
    
    static int[] rowWiseSum(int[][] mat)

{ 
    int[] sum = new int [mat.length];

for(int i=0; i<mat.length;i++)

{
     for (int j=0; j<mat[i].length; j++)

{
     sum [i] = sum [i] + mat [i][j];

}

}

return sum;

}

static int[] columnWiseSum(int[][] mat) 
{

    int [] sum = new int [mat [0].length];
    for (int i=0; i<mat [0].length; i++)
  {
    for (int j=0; j<mat.length; j++)
   { 
      sum[i] = sum[i]+mat[j][i];
    }

}
return sum;
}
}
