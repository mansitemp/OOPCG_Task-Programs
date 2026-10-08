import java.util.Scanner;
 public class Sum_Calculator{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

    int sum=0;

    System.out.println("Enter a number to calculate sum: ");
    int num= sc.nextInt();
    
    for (int i=1; i<=num; i++){
        sum += i;
    }
    System.out.println("Sum of all numbers upto " +num +":" +sum);

    sc.close();
    }}
