/*
This is a basic banking project which is made using methods concept in Core Java
 */

public class Bank {
    static int CurrentBalance = 10000;
    public static void GreetCustomer(){
        System.out.println("Hello Dear Customer Welcome to our Bank");
    }
    public void Deposit(int amount){
    CurrentBalance = CurrentBalance + amount;
        System.out.println(CurrentBalance);
    }
    public void WithDraw(int amount){
     CurrentBalance = CurrentBalance - amount;
        System.out.println(CurrentBalance);
    }
    public static int GetCurrentBalance(){
    return CurrentBalance;
    }


    public static void main(String[] args) {
        GreetCustomer();
        Bank bank = new Bank();
        bank.Deposit(200);
        bank.WithDraw(2000);
        GetCurrentBalance();
    }
}