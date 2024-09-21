package StringProgram;

import java.util.Scanner;

public class ReverseWord {

    static String reverseWords(String str){

        String rs ="";

        char[] ch = str.toCharArray();
        for(int i =0;i<ch.length;i++){

            int f=i;
            while (i<ch.length && ch[i] !=' ') {
                i++;
            }

            int l =i-1;
            while (l>=f) {

                rs = rs+ch[l];
                l--;
                
            }
            if (i<ch.length) {

                rs = rs+ch[i];
                
            }
        }

        return rs;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String ");
        String str =sc.nextLine();

        String rs = reverseWords(str);
        System.out.println(rs);
    }
    
}
