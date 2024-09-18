package StringProgram;

import java.util.Scanner;

public class FLCaps {

     static String initCapital(String str){

        char[] ch = str.toCharArray();

        for(int i=0;i <ch.length;i++)
        
        
        {
            if((i==0&&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ')||(i == ch.length-1 && ch[i]!=' ' || ch[i] != ' ' && ch[i+1] == ' ')){

                if(ch[i] >= 'a' && ch[i]<='z'){
                    ch[i] = (char)(ch[i] - 32);
                }
                
            }
            else{

                if(ch[i]>='A'&&ch[i]<= 'Z')
                ch[i] = (char)(ch[i] + 32 );
            }

        }
        return new String(ch);
    }

    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String");

        String str = sc.nextLine();
         str = initCapital(str);

       System.out.println(str);
    }
    
}
