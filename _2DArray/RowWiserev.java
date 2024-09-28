package _2DArray;

public class RowWiserev {
    

    static void rowWiseRev(int [][] mat){

        for(int i =0;i<mat.length;i++){

            int l =0, h = mat[i].length -1;

            while (l<h) {

                int temp = mat[i][l];
                mat[i][l] = mat[i][h];
                mat[i][h] = temp;

                l++;
                h--;
            }
            //System.out.println(mat);
        }
    }
        public static void main(String[] args) {


            int[][] ar ={ 
                
                        {1,2,3},
                        {4, 5, 6},
                        {7, 8, 9}
                    };

                rowWiseRev(ar);

                for(int i =0;i<ar.length;i++){
                    for(int j=0; j<ar[i].length; j++){
                        System.out.print(ar[i][j]+" ");

                    }
                    System.out.println();

                    
                }
}

}
