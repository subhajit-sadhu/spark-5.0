package Main_course.Lamda;

public class loop {
    public static void main(String[] args) {
        Runnable task = ()->{
            for(int i=1;i<=10;i++) {
                System.out.println(i);
            }
            };

            new Thread(task).start();

    }

}
