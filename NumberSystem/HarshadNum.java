package NumberSystem;

public class HarshadNum {


    static int sumOfDigit(int n){

        int sum = 0;

        do{

            sum = sum+n%10;
            n/=10;

        }while(n!=0);

        return sum;
    }


    static boolean isHarshad(int n){

        return n%sumOfDigit(n)  == 0;
    }
    
    public static void main(String[] args) {
        for(int i = 1; i<=100;i++){
    
            boolean rs = isHarshad(i);
    
            if(rs)
                System.out.print(i+" ");
    
          
        }
      }
}
