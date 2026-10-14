package Main_course.project_GaragarageSysem;

public class ReturnDemo {
    public static void main(String[] args) {
        // m1();
        int res = m2();
        System.out.println(res);
    }
    public static void m1(){
        try {
            System.out.println("Try block Execute..");
            return;
        } catch (Exception e) {
            System.out.println("catch block Execute..");
        }
        finally{
            System.out.println("Finally Executed..");
        }
    }

    //@SuppressWarnings("finally")
    public static int m2(){
        try {
            System.out.println(10/0);
            return 777;
        } catch (Exception e) {
            return 111;
        }
          finally{
            return 7676;
          }
    }
}
