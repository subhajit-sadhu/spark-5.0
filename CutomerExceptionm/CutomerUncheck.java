package Main_course.CutomerExceptionm;

public class CutomerUncheck {
     static int balance = 10000; 
    public static void main(String[] args) {
        try {
            withdraw(100000);
            
        } catch (LowBalanceException e) {
            System.out.println( e.getMessage());
        }
        // withdraw(1000000);
    }
    public static void withdraw(int amount) throws LowBalanceException{
        if(amount>balance){
            throw new LowBalanceException("Insufficient balance");      
        }
        System.out.println("Wthdrawal Succesfull , new balance : " + (balance-amount));

    }
}
