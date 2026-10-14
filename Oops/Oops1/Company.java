package Main_course.Oops.Oops1;

public class Company {
public static void main(String[] args) {
    Employee e1 = new Employee();
    System.out.println(e1.roll);    
    e1.setroll(66);
    System.out.println(e1.roll);    

    Employee e2 = new Employee(2);
    System.out.println(e2.roll);
    
    Employee e3 = new Employee("Subhajit");
    System.out.println(e3.name);
}
}
