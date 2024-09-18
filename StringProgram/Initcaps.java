package StringProgram;

import java.util.Scanner;

public class Initcaps {

        static String initCaps(String str) {
            // Convert the string to a character array
            char[] ch = str.toCharArray();
            
            boolean isStartOfWord = true;  // Flag to check the start of a word
            
            for (int i = 0; i < ch.length; i++) {
                // If the current character is a space, next character could be a word start
                if (ch[i] == ' ') {
                    isStartOfWord = true;
                } else if (isStartOfWord) {
                    // Start of a new word: Convert to uppercase if it's a lowercase letter
                    if (ch[i] >= 'a' && ch[i] <= 'z') {
                        ch[i] = (char) (ch[i] - 32);  // Convert to uppercase
                    }
                    isStartOfWord = false;  // Mark that we're no longer at the start of the word
                } else {
                    // Inside a word: Convert to lowercase if it's an uppercase letter
                    if (ch[i] >= 'A' && ch[i] <= 'Z') {
                        ch[i] = (char) (ch[i] + 32);  // Convert to lowercase
                    }
                }
            }
            
            // Convert the character array back to a string
            return new String(ch);
        }
        
        public static void main(String[] args) {
            // String testStr1 = "hello world";
            // String testStr2 = "multiple   spaces";
            // String testStr3 = "SINGLEword";
            // String testStr4 = "  leading and trailing spaces   ";
            // String testStr5 = "mIxEd CaSe wOrDs";
            
            // System.out.println(initCaps(testStr1));  // Output: "Hello World"
            // System.out.println(initCaps(testStr2));  // Output: "Multiple   Spaces"
            // System.out.println(initCaps(testStr3));  // Output: "Singleword"
            // System.out.println(initCaps(testStr4));  // Output: "  Leading And Trailing Spaces   "
            // System.out.println(initCaps(testStr5));  // Output: "Mixed Case Words"


             Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String");

        String str = sc.nextLine();
        

         String rs = initCaps(str);

       System.out.println(rs);
    }
 }
    
    

