package Main_course.MultiThread.Syncronization;

class bankAccount{
    int balannce = 10000;
    public  void withdraw(int amount){

        if(balannce >=amount){

            System.out.println("Total balance is "+balannce);
            System.out.println(Thread.currentThread().getName()+"  is going to withdraw rs  "+amount + "  Total Balance is : " +  balannce);
            try {
                Thread.sleep(100);
            }
            catch (InterruptedException e) {
                System.out.println("Thread interactpted ");
            }

            synchronized (this){
                System.out.println(
                        "Lock acquired: " +
                                Thread.holdsLock(this)
                );
                if(balannce >= amount){
                        balannce = balannce - amount; // critical code
                        System.out.println(Thread.currentThread().getName() + " is  completed  withdraw  "  + " and remaining balance =  " + balannce);

                }

            }


        }
        else {
            System.out.println(Thread.currentThread().getName()+ "Balance underflow");
        }
    }
}
class persons extends Thread{
    bankAccount account;
    persons(String name,bankAccount account){
        super(name);
        this.account = account;
    }

    @Override
    public void run() {
        account.withdraw(5000);
    }
}
public class SyncDemo {
    static void main(String[] args) {
        bankAccount act = new bankAccount();
        persons husband = new persons("husband", act);
        persons wife = new persons("Wife", act);
        persons child = new persons("child", act);
        husband.start();
        wife.start();
        child.start();

    }

}
