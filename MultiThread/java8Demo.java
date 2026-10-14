package Main_course.MultiThread;

public class java8Demo {
    public static void main(String[] args) {

        Runnable task = ()->{
            for(int i=0;i<10;i++){
                System.out.println("executing in "+ Thread.currentThread().getName());
            }


        };
        new Thread(task).start();
        new Thread(task).start();
    }
}
