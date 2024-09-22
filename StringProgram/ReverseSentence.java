package StringProgram;
import java.util.*;
public class ReverseSentence {

    static String reverseWords(String str){
        String rs ="";
        char[] ch = str.toCharArray();
        for(int i =0;i<ch.length;i++){
            int l=i;
            while (i<ch.length && ch[i] !=' ') {
                i--;
            }
            int f =i+1;
            while (f<=l) {
                rs = rs+ch[f];
                f++;  
            }
            if (i>=0) {
                rs = rs+ch[i];                
            }
        }
        return rs;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String ");
        String str =sc.nextLine();   //siwan
        String rs = reverseWords(str);
        System.out.println(rs);//nawis 
    }  
    
}
