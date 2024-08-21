import java.util.Scanner;

public class Alphabet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        displayAlphabet(n);
       
    }
    public static void displayAlphabet(){

        for(char i = 'A';i<= 'Z';i++){

            System.out.println(i+ " ");

        }
    }
    
}
