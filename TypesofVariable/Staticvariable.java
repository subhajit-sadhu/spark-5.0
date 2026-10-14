package Main_course.TypesofVariable;

public class Staticvariable {
    public static void main(String[] args) {
        // st.call();  Can't called by reference variable ..
        Staticvariable.call(); // Called Method  by class name.. 
        Staticvariable_2  st = new Staticvariable_2();
        st.dispaly();
        System.out.println("......");
        Staticvariable_2.Stream = "MCA";
        // System.out.println("");
        st.dispaly();
        Staticvariable_2 stt = new Staticvariable_2();
        Staticvariable_2.Stream = "Certificate";
        stt.dispaly();
        System.out.println("..........");
        st.dispaly();

    }
    public static void call(){
        System.out.println("Static Method is  always Called by Class");
    }
}
