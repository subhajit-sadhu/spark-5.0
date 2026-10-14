package Main_course.Exception_2;

public class ThrowDemo2 {
    public static void main(String[] args) {
        String pass = "1233";
        checkpass(pass); 
    }
    public static void checkpass(String pass){
        if(pass.length()< 6){
            // throw new RuntimeException(pass);
            // throw new RuntimeException("Password too short ");
            throw new NumberFormatException("Wrong number");
        }
        System.out.println("Password is Strong");
    }
}
