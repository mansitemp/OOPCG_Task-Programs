import java.util.Scanner;
 public class Accept_Numbers{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

    for (int i=1; i<=10; i++){
    System.out.println("Enter a number: ");
    int num= sc.nextInt();
    
    if(num==50){
        System.out.println("Value 50 entered!");
        break;}}
    
    System.out.println("Program terminated!");
    sc.close();
}}

 