package Main_course.MultiThread;
class MyThread1  implements  Runnable{
    @Override
    public void run() {
        for(int i=0;i<100;i++){
            System.out.println("new Thread Running ....   " + Thread.currentThread().getName());
        }
    }
}
public class ThreadPriority {
    public static void main(String[] args) {

        Thread t1 = new Thread(new MyThread1(),"Thread-1") ;
        Thread t2 = new Thread(new MyThread1(),"Thread-2");

        // set priority
        t1.setPriority(Thread.MAX_PRIORITY);
//        t1.setPriority(Thread.NORM_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
    }
}
