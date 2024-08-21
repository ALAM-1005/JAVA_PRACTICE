/**
 * Define a methd to display upper case and lower case of alphabet .
 */

import java.util.Scanner;

public class Alphabet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char  ch = sc.next().charAt(0);
        displayAlphabet(ch);
       
    }
    public static void displayAlphabet(char ch){

        for(char i = 'A';i<= 'Z';i++){

            System.out.println(i + " ");

        }
    }
    
}
