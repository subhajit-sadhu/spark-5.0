package Main_course.MultiThread.Prevent;
class Computer extends Thread{

}
public class YieldDemo {
    public static void main(String[] args) {
        Computer c1 = new Computer("f-1");
        Computer c2 = new Computer("f-2");
        
        c1.start();
        c2.start();
    }
}
