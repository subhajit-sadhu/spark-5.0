package Main_course.Oops.Superthis;


class ParentClass {
    String name = "Subhajit";
    ParentClass(){
        System.out.println("Parent class");
        // throw new RuntimeException("not making object..."); This means  child  class is fully depent on parent class
    }
    // void details(){
    //     System.out.println("Parent class " + name.toUpperCase());
    // }
    void details(String name){
        System.out.println(name.toUpperCase());
    }
    void details(String name , String add){
        System.out.println(name.toUpperCase());
    }
    void details(){
        System.out.println("hello");
    }

}

class Childclass extends ParentClass {
    String Surename;
    Childclass(){
        System.out.println("Child Constractor");
    }
    Childclass(String name){
        this(); // always pointing to default constractor
        System.out.println("Child Constractor 2");
    }


    public void details(){
        // Super keyword used to access Parent class from child classs
        super.name = "Subhajit ";
        // this keywor duse to access name class
        this.Surename ="Sadhu";

        System.out.println(super.name + "And " + Surename);
        super.details();
    }
    public void hello(){
        System.out.println("Hello jii");
    }
    public static void main(String args[]){
        Childclass c = new Childclass();
        c.details();

        System.out.println("..........");

        ParentClass p = new ParentClass();
        p.details();
        //p.hello

        ParentClass p1 = new Childclass();
        p1.details("Subhajit");
        // here we are not  using parent class method 
        // We are using parent reference but method from child
    }
    
}