package Main_course.Exception_2;


public class ExceptionDepth {
    public static void main(String[] args) {
         showroom();
    }
    public static void showroom(){
        System.out.println("let see car..");
        testDrive();
    }
    public static void testDrive(){
        System.out.println("Test drive...");
        paperwork();
    }
    public static void paperwork(){
        System.out.println("Submit all paper.. ");
        done();
    }
    public static void done(){
        System.out.println(" Payement done");
        try{
            System.out.println(10/0);

        }
        catch(ArithmeticException e){
            //e.printStackTrace(); 
            System.out.println("jihsdfjkhk");
        }
    }
}
