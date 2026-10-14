package Main_course.AbstractDemo;

public class App {
    public static void main(String[] args) {
//        Payment p = new InternetBanking();
//        p.pay();
//        p.invoice();
        CardPayment cardPayment = new CardPayment();
        cardPayment.pay();
        }
    }

