package PreProgramming;
class Rose{

    int price = 50;   // global Variable

    String color = "Red";   // Global Variable
    public static void main(String[] args) // main maethod  here so execution starts here
    {
        

        Rose R1 = new Rose();  // Object Creation
        Rose R2 = new Rose();  // Object Creation

        System.out.println(R1.color);  // inheritate the global variable using object creatioon


    }
}