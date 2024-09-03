

/**
 * MainArray
 */
public class MainRunner {

    

    public static void main(String[] args) {

        int[] ar = {23,57,45,67,76};

        System.out.println(ar);

        System.out.println("No of elements :"+ar.length);  

        //ar.length++ & ar.lenght --  ---> Not possible (used) in java array becoause length is a final instance variable. 

        for (int i =0;i<ar.length;i++){

            System.out.println(i+"--->"+ar[i]);

        }
    }


}