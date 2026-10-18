import java.util.Scanner;
 public class Customer_Transaction_Risk_Detector{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

    int low_risk=0;
    int medium_risk=0;
    int high_risk=0;

    for (int t=1; t<=10; t++){

    System.out.println("Enter transaction amount: ");
        float amount= sc.nextFloat();

    if (amount<0){
        System.out.println("Error! Amount can't be negative");}
    else if (amount>50000){
        System.out.println("High risk");
        high_risk +=1;}
    else if (amount<=50000 && amount>=20000){  System.out.println("Medium risk");
        medium_risk +=1;}
    else if (amount<20000){
       System.out.println("Low risk");
        low_risk +=1;}
    else{
        System.out.println("Invalid input");}
}
System.out.println("Number of low risk transactions: " +low_risk);
System.out.println("Number of medium risk transactions: " +medium_risk);
System.out.println("Number of high risk transactions: " +high_risk); 

sc.close();
    }
 }
