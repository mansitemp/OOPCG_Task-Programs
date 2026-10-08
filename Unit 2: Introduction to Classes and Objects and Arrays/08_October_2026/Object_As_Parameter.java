//Concept: Using object as a parameter.
class Object_As_Parameter{
    String Account_holder;
    double balance;
    void Transfer_to(Object_As_Parameter receiver, double amount){
        System.out.println("Account holder's balance: " +balance);
      
        if (balance>=amount){
            balance +=amount;
            receiver.balance= receiver.balance + amount;}
      
        System.out.println("Transferred: " +amount);
        System.out.println("Receiver's balance updated to: " +balance);}

public static void main(String[] args){
    Object_As_Parameter a1= new Object_As_Parameter();
    Object_As_Parameter a2= new Object_As_Parameter();
  
    a1.balance= 20000;
    a2.balance= 15000;
    a1.Transfer_to(a2,5000);
}}
