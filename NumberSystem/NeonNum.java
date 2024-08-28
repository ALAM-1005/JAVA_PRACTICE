package NumberSystem;
public class NeonNum {

    static int sumOfDigit(int n){

        int sum = 0;

        do{

            sum = sum+n%10;
            n/=10;

        }while(n!=0);

        return sum;
    }

    static boolean isNeon(int n){

        return n == sumOfDigit(n*n);
    }

    public static void main(String[] args) {

        for(int i = 1; i<=100;i++){

            boolean rs = isNeon(i);

            if(rs)
                System.out.print(i+" ");

          
        }
        
    }
    
}
