package Main_course.Oops.Superthis.Parentchild;

public class Testparent {
    public static void main(String[] args) {
    Mychild c = new Mychild();  //LHS = RHS
    c.display();
    c.call();    

    Myparent p = new Myparent();
    p.call();

    Myparent m1 = new Mychild(); //LHS != RHS 
    m1.call();
    }
    
}
