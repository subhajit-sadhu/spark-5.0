package Gettersetter;
public class Student {

        Student(){
        System.out.println("Constractor ....");
    }
    Student(int Roll){
        this.Roll=Roll;
    }


         String name;
         int  id;    
         int Roll;

    public String getName(){
        return name;
    }
    public void setName(String name){
         this.name = name;
         System.out.println(name);
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    // @Override
    // public String toString() {
    //     return "Student{"+"id" +id +
    //     "name"+ name + "\"}";
    // }


}



