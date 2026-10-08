//Concept: Using object as a parameter.
class Bank_Account{
    String Account_holder;
    double balance;
    void Transfer_to(Bank_Account receiver, double amount){
        System.out.println("Account holder's balance: " +balance);
      
        if (balance>=amount){
            balance +=amount;
            receiver.balance= receiver.balance + amount;}
      
        System.out.println("Transferred: " +amount);
        System.out.println("Receiver's balance updated to: " +balance);}

public static void main(String[] args){
    Bank_Account a1= new Bank_Account();
    Bank_Account a2= new Bank_Account();
  
    a1.balance= 20000;
    a2.balance= 15000;
    a1.Transfer_to(a2,5000);
}}
