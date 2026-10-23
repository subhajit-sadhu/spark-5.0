package Main_course.MultiThread.Prevent;
class TeaMaker extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("Boiling Water....");
            Thread.sleep(4000);
            System.out.println("Tea is Ready....");
        } catch (InterruptedException e) {
            System.out.println("Tea making interrupt");        }

    }
}
public class SleepDemo {
    static void main(String[] args) {
        TeaMaker teaMaker = new TeaMaker();
        teaMaker.start();
//        teaMaker.interrupt();

    }
}
