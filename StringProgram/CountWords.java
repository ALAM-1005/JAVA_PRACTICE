package StringProgram;
import java.util.*;
public class CountWords {
    static int countWords(String str){

        int count =0;

        // str = str.toLowerCase();  to convert all the string in small
        char[] ch = str.toCharArray();

        for(int i =0;i<ch.length;i++){
            if(i==0&&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ');          //||(i == ch.length-1 && ch[i]!=' ' || ch[i] != ' ' && ch[i+1] == ' '))
               { 
                
                if((ch[i] == 'a'||ch[i] == 'e'||ch[i] == 'i'||ch[i] == 'o'||ch[i] == 'u')||(ch[i] == 'A'||ch[i] == 'E'||ch[i] == 'I'||ch[i] == 'O'||ch[i] == 'U'))
                    count++;
            }
        }

        return count;

        
    }

    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String");

        String str = sc.nextLine();
        int  count = countWords(str);

       System.out.println(count);
    }
}
