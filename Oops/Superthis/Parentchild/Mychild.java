package Main_course.Oops.Superthis.Parentchild;

public class Mychild extends Myparent {
    void display(){
        System.out.println("Hii guys ..."); 
    }
    @Override
    public void call() {
        System.out.println("Child class");
    }
}
