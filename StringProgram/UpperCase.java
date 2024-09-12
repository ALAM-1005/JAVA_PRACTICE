package StringProgram;

public class UpperCase {

    public static void main(String[] args) {


        String str = "Java";

        char[] ch = str.toCharArray();

        for(int i = 0;i<ch.length;i++){

            if(ch[i]>='a' && ch[i]<='z'){

                ch[i] = (char)(ch[i]-32);
            }


        }
        str = new String(ch);

        
        System.out.println(str);
    }
    
}
