package Main_course.Lamda;

public interface addition {
    int add(int a, int b);

    public  class Simpleaddition{
         public static void main(String[] args) {
            addition sum = (a, b)-> a+b;
            int res = sum.add(2,4);
             System.out.println("The total is : " + res);
        }

    }


}
