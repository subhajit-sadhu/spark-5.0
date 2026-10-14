package Main_course.Exception;
public class FinallyDemo {
    public static void main(String[] args) {
        float res = add(20,0);
        System.out.println(res);
    }
    public static float add(int a, int b){
        try {
            
            int res = a/b;

        } catch (Exception e) {
            System.out.println("inside Catch Block");
        }
          finally
        {
            System.out.println("Finally execute");
        }
        
        return 0;
    }
}
