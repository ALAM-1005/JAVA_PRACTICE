package NumberSystem;

public class Palindrone {

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


  public static void main(String[] args) {
    for(int i = 1; i<=100;i++){

        boolean rs = isPalindrone(i);

        if(rs)
            System.out.print(i+" ");

      
    }
  }
    
}
