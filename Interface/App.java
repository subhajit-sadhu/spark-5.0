package Main_course.Interface;

public class App {
    public static void main(String[] args) {
        Payment p = new UpiPay();
        p.pay();
        System.out.println(Payment.name);// because it is static
    }
}
