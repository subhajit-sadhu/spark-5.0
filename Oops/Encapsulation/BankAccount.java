package Main_course.Oops.Encapsulation;

public class BankAccount {
    // Controlling access //
     private int Accountnumber;
     private double balance;
     BankAccount(int Accountnumber , double balance){
        if(Accountnumber <= 0){
            throw new IllegalArgumentException("Invalid Account number ");
        }
        if(balance < 0){
            throw new IllegalArgumentException("Negative Balance ");
        }
        this.Accountnumber = Accountnumber;
        this.balance = balance;
     }
     public int getAccountnumber() {
         return Accountnumber;
     }
     
     public double getBalance() {
         return balance;
     }

     public void setAccountnumber(int accountnumber) {
         Accountnumber = accountnumber;
     }
     public void setBalance(double balance) {
         this.balance = balance;
     }
     public static void main(String[] args) {
    
        BankAccount bnk = new BankAccount(90,800);
        bnk.setAccountnumber(2367372);
        bnk.setBalance(2); 
        System.out.println("My Account number : " + bnk.getAccountnumber());
        System.out.println("My Current Balance is : $ " + bnk.getBalance());
     }
     
      
}
