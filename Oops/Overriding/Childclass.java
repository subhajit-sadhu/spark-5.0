package Main_course.Oops.Overriding;

public class Childclass extends ParentClass {
    @Override
    public void gold() {
        super.gold();
        System.out.println();
    }
    @Override
    public void plot() {
        super.plot();
        System.out.println("200gj ka 20 plot hai");
    }
}
