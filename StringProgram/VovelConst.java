package StringProgram;

public class VovelConst {

    public static void main(String[] args) {


        String str = "Java";

        char[] ch = str.toCharArray();  // string to char

        int v = 0,c =0;
        for(int i = 0;i<ch.length;i++){

            if(ch[i] =='a'|| ch[i]=='e' ||ch[i]=='i' ||  ch[i]=='o' || ch[i]=='u'){

               v++;
            }
            else
            c++;


        }
        str = new String(ch);  // Assign into string and pass the Character in string method


        System.out.println(c);
        System.out.println(v);
    }
    
}
