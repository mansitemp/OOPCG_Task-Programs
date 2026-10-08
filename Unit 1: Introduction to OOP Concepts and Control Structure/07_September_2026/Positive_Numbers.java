import java.util.Scanner;
 public class Positive_Numbers{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

    for (int i=1; i<=10; i++){
    System.out.println("Enter a number: ");
    int num= sc.nextInt();
    
    if (num<=0){
        continue;}
    else{
        System.out.println("Positive number");
    }}

    sc.close();
}}

 