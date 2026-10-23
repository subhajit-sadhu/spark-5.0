package Main_course.MultiThread.Prevent;
class Computer extends Thread{
    public Computer(String name) {
        super(name);
    }
public void run(){
        for(int i=0;i<=5;i++){
            System.out.println(getName() + "  Using computer "+i);
        }
        //willing to give chance to other thead
        Thread.yield();
}
}
public class YieldDemo {
    public static void main(String[] args) {
        Computer c1 = new Computer("f-1");
        Computer c2 = new Computer("f-2");
//        c2.setPriority(Thread.MAX_PRIORITY);
        c1.start();
        c2.start();
    }
}
