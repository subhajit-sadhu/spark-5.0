package Main_course.Exception_2;

public class Multicatch {
    public static void main(String[] args) {
        String name = "Subhajit";
    int[] arr = {12,3,1};

    try{
        int result = Integer.parseInt(name);
        System.out.println(arr[5]);
    }
    catch(NullPointerException e){
        System.out.println("Null error");
    }
    catch(ArrayIndexOutOfBoundsException e){
        System.out.println("invalid Index");
    }        
    catch(NumberFormatException e){
        System.out.println("Number formatb not match");
    }
    // catch(Exception e){
    //     System.out.println("error");
    // }
    }

}
