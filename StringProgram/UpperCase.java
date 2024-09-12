package StringProgram;

public class UpperCase {

    public static void main(String[] args) {


        String str = "1020";

         // string to char
        int sum = 0;
        for(int i = 0;i<str.length();i++){

            char ch = str.intAt(i); 
System.out.println(ch+sum);

            if(ch>=0 && ch<=9){
                sum = (int)(ch+sum);
            }
                

            // if(ch[i]>='a' && ch[i]<='z'){

            //     ch[i] = (char)(ch[i]-32);  // convert into the Upper case letter
            // }


        }
        // str = new String(ch);  // Assign into string and pass the Character in string method


        System.out.println(sum);
    }
    
}
