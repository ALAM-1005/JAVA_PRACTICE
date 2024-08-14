public class Mobile1 {

    int price;
    String name,brand;

    private Mobile1(){

        this.name = name;
        this.brand = "Sumsang";
        this.price = 124563;




       // System.out.println("Custome Constructor");
    }

    public static void main(String[] args) {
        

        Mobile1 M = new Mobile1();


        System.out.println(M.brand);
    }
    
}
