package NumberSystem;

public class EmtrimNum {

    static boolean isPrime(int n){

        if(n == 0 || n== 1)
            return false;

        for(int i= 2; i<=n/2; i++){

            if(n%i == 0){
                return false;
            }

            
        }
        return true;
    }

    static int reverse(int n){

        int rev = 0;
        do{

            rev = rev*10+n%10;

            n/=10;
        }while(n!=0);

        return rev;
    }

    static boolean isPalindrone(int num){

        return num == reverse(num);
      }
    

      static boolean isEmtrim(int n){

        return isPrime(n)  &&  isPrime(reverse(n));
      }


      public static void main(String[] args) {
        for(int i = 1; i<=100;i++){
    
            boolean rs = isEmtrim(i);
    
            if(rs)
                System.out.print(i+" ");
    
          
        }
      }
}
