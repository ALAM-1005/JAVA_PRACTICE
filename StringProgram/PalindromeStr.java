package StringProgram;

public class PalindromeStr {
static boolean isPalindrome(String str){


    str = str.toLowerCase();

    int i = 0,j =str.length()-1;
    while(i<j){

        if(str.charAt(i) != str.charAt(j)){

            return false;
        }

        i++;
        j++;
    }
    return true;
}

    public static void main(String[] args) {
        String s = "Malayalam";

        // char[] ch = s.toCharArray();

        // for(int i =ch.length -1;i>=0;i--){

        //     System.out.print(ch[i]+" ");

        // }

       System.out.println(isPalindrome(s)); 


    }
    
}
