import java.util.Scanner;
 public class Reverse_Number{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

    System.out.println("Enter a number: ");
    int num= sc.nextInt();
    
    int reverse= 0;
    int original= num;
    
 while (num!=0){
    int rem= (num%10);
    reverse = (reverse*10+rem);
    num= (num/10);}

        System.out.println("Original number: " +original);
        System.out.println("Reversed number: " +reverse);
    
    sc.close();
}}
        