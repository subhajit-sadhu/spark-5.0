package Main_course.Exception_2;

public class Multiplecatch {
    public static void main(String[] args) {
        int res = data();
        System.out.println(res);
    }
        public static int data(){
            int arr[] = {1,0,4,0,6,2,6,2};
        try {
            //int res = arr[0] / arr[1];
             int res = arr[20];
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException Exception ..");
            e.printStackTrace();
            e.getMessage();
          }
          catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("ArrayIndexOutOfBoundsExceptio Exception");
            ex.printStackTrace();
            System.out.println(ex.getMessage());
          }
          catch(Exception ee){
            ee.printStackTrace();
          }
            return 0;


    }
    
        
        
}
