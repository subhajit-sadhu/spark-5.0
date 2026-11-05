package Main_course.MultiThread.Communication;
class WeddingHall{
    boolean dinnerReady = false;
}
class Guest extends Thread{
    WeddingHall hall;
    Guest(WeddingHall h){
        hall = h;
    }

    @Override
    public void run() {
         synchronized (hall){
             System.out.println("Guest enter the hall ... ");
              while(!hall.dinnerReady) // false
             {
                 System.out.println("Dinner not ready . Guest Please wait ..");
                 try{
                     hall.wait();//realse lock
//                     System.out.println("Getting lock back");
                 }
                 catch(InterruptedException e){
                     e.printStackTrace();
                 }
             }
             System.out.println("Guest is having Dinner...");
         }
    }
}

class chef extends Thread{
    WeddingHall hall;
    chef(WeddingHall h){
        hall = h;
    }

    @Override
    public void run() {
        synchronized (hall){
            System.out.println("Chef Started preparing dinner ... ");
            try {
                Thread.sleep(3000);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
            hall.dinnerReady = true;
            hall.notifyAll();
            System.out.println("Cook :  Dinner is Ready ...");
        }
    }
}
public class Communicationdemo {
    public static void main() {
        WeddingHall hall = new WeddingHall();
        Guest guest = new Guest(hall);
        chef chef = new chef(hall);
        guest.start();
        chef.start();
    }
}
