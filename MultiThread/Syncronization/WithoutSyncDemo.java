package Main_course.MultiThread.Syncronization;

class BankAccount{
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

                balannce = balannce-amount; // critical code


            System.out.println(Thread.currentThread().getName()+" is  completed  withdraw and remaining balance =  "+balannce);
        }
        else {
            System.out.println(Thread.currentThread().getName()+ "Balance underflow");
        }
    }
}
class person extends Thread{
BankAccount account;
person(String name,BankAccount account){
    super(name);
    this.account = account;
}

    @Override
    public void run() {
        account.withdraw(5000);
    }
}
public class WithoutSyncDemo {
    static void main(String[] args) {
        BankAccount act = new BankAccount();
        person husband = new person("husband", act);
        person wife = new person("Wife", act);
        person child = new person("child", act);
        husband.start();
        wife.start();
        child.start();

    }

}
