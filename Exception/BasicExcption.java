package Main_course.Exception;
public class BasicExcption{
public static void main(String[] args) {

    try{
        System.out.println("Berofe Try block.. ");
        System.out.println(10/0);
        System.out.println("After Risky code ..");

    }
    catch(Exception e){
        System.out.println("in catch block");
        System.out.println(e.getMessage());
    }
    System.out.println("hii..");
    System.out.println("Hiii...");
}
    
}
  