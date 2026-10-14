package Main_course.MultiThread;

public class Firstprog {
    static class MyThread extends Thread{
    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println("Thread running - " + Thread.currentThread().getName());
        }
    }
    }
    public static void main(String[] args){
        System.out.println("helloo");
        MyThread t = new MyThread(); // instantiation of thread
        t.start(); // create a new  thread
        System.out.println(Thread.currentThread().getName());
        MyThread t2 = new MyThread();
        t2.start();

        for(int i=0;i<=5;i++){
            System.out.println(" main Thread ");
        }
        }
}
