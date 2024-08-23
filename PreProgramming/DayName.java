package PreProgramming;
import java.util.Scanner;
class DayNum {

    public static  void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number of Days");

        int Day = sc.nextInt();

        weekDay(Day);
    }
    
    static void weekDay(int num){

        switch (num) {
            case 1:

            System.out.println("Sunday");
                
                break;

            case 2:

            System.out.println("Monday");

                break;

            case 3:

            System.out.println("Tuesday");

                break;
            case 4:

            System.out.println("wednesday");

                break;
            case 5:

            System.out.println("Thruesday");

                break;
            case 6:

            System.out.println("Friday");

                break;
            case 7:

            System.out.println("Saturday");

                break;

        
            default:
                System.out.println("Invalid data ");
                break;
        }
    }

}
