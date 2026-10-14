package Main_course.Exception_2;
import  java.util.Scanner;

public class Scanners {
      public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      // float f = sc.nextFloat();
      // System.out.println(f);

      // floating part ......

      // String name = sc.next();
      // Float a = Float.parseFloat(name);// converted string to Float value with useing "f"
      // System.out.println(a);

      //nextLine part()

      System.out.println("enter  First name : ");
      String fname = sc.next();
      System.out.println("First name before use whitesapce  " + fname);

      System.out.println("surname name(Auto matically add/After use White ):-  ");
      String sname = sc.nextLine();
      System.out.println(sname);
      }
}
