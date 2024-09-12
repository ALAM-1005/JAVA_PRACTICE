package StringProgram;

public class UpperCase {

    public static void main(String[] args) {


        String str = "Java";
        char[] ch = str.toCharArray();
         // string to char
        for(int i = 0;i<str.length();i++){


               

             if(ch[i]>='a' && ch[i]<='z'){

                ch[i] = (char)(ch[i]-32);  // convert into the Upper case letter
             }


        }
         str = new String(ch);  // Assign into string and pass the Character in string method


        System.out.println(str);
    }
    
}
