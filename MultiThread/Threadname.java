package Main_course.MultiThread;
class MyThread implements Runnable{
    @Override
    public void run() {
        System.out.println("new Thread Running ....");
    }
}
public class Threadname {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyThread()); {
            // gettting name
            String name = t1.getName(); //default name
            System.out.println("default name of thread : " +name);
            System.out.println("line execute by thread  " + Thread.currentThread().getName());

            // set name
            t1.setName("MyThread-0");
            String updateName = t1.getName();
            System.out.println("update name of thread : " +updateName);
            t1.start();
        }
    }
}
