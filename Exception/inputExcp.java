package Main_course.Exception;

public class inputExcp {
    public static void main(String[] args) {
        String s1 = "abc123";
        try {
            int value = Integer.parseInt(s1);
            System.out.println("Parsed value : " + value);
        } catch (NumberFormatException e) {
            System.out.println("Invalid Exception  " + s1);
        }
    }
}
