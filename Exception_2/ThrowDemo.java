package Main_course.Exception_2;

public class ThrowDemo {
    public static void main(String[] args) 
    {
        validAge(17);
        System.out.println("proigram done");        
    }
    public static void validAge(int age) 
    {
            if(age<18)
                {
                throw new IllegalArgumentException("Age must be above 18");
                // throw new IllegalArgumentException();
                }
                System.out.println("Allowed Age ....");
    }
}
   