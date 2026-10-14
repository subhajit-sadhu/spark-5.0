package Main_course.Oops.Oops1;

public class Employee {
    String dept;
    String name;
     int roll ;
Employee(){
    System.out.println("Constractor");
}
Employee(int roll ){
    this.roll =roll;
}
Employee(String name){
    this.name = name;
}
Employee(int roll,String name, String dept){
    this.roll=roll;
    this.name = name;
    this.dept = dept;

}

public int getroll(){
    return roll;
}
public void setroll(int roll){
    this.roll =roll;
}
public String getname(){
    return name;
}
public void setname(String name){
    this.name = name;
}

}


