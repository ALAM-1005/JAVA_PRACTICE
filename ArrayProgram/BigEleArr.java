package ArrayProgram;

public class BigEleArr {

    static int nthBiggest(int[] x,int n){

        for(int i =0;i<x.length;i++){

            int count = 0;

            
            for(int j =0;j<x.length;j++){

                if(x[i]>x[j]{
                    count++;
                }
                if(count == n-1)
                return x[i];
            }
        }


        System.out.println("No Biggest Number");

        return 0;
    }

    public static void main(String[] args) {
        int[] ar = {25,36,45,78,96};
        int bg = nthBiggest(ar, 4);

        System.out.println("4th Biggest elements :"+bg);
     }
    
}
