import java.util.Scanner;
 public class Fraudulent_Transaction_Detector{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

int suspicious_transactions=0;
int total_value=0;

for (int i=1; i<=8; i++){
    System.out.println("Enter transaction amount: ");
    int transaction= sc.nextInt();

    if (transaction>100000){
        System.out.println("Suspicious transaction detected!");
        suspicious_transactions = suspicious_transactions+1;
        total_value = total_value+transaction;
}
}
System.out.println("Number of suspicious transactions: " +suspicious_transactions);
System.out.println("Sum of suspicious transactions: " +total_value);
sc.close();
        }}