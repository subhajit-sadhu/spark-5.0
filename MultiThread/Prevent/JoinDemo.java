package Main_course.MultiThread.Prevent;
class WashingMachine extends Thread {
    public void run() {
        try {
            System.out.println("Washing Start ....");
            Thread.sleep(3000);
            System.out.println("Washing Stop ....");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
public class JoinDemo {
    public static void main(String[] args) throws InterruptedException {
        WashingMachine w = new  WashingMachine();
        w.start();
//        w.join();
        w.join(4000);
//        w.join(100);
        System.out.println("Now start drying");

    }
}
