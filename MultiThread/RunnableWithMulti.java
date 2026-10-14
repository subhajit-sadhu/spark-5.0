package Main_course.MultiThread;

class Mytask implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 6; i++) {
            System.out.println( Thread.currentThread().getName() + "executing  " +i);
        }

    }
}
public class RunnableWithMulti  {
    public  static void main(String[] args) {
        Mytask task = new Mytask();
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        t1.start();
        t2.start();
    }
}

