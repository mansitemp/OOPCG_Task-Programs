import java.util.Scanner;
 public class Second_Highest_Salary{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

    int highest= 0;
    int second_highest= 0;

for (int n=1; n<=5; n++){
    System.out.println("Enter salary of employee: ");
    int salary= sc.nextInt();

    if (salary>highest){
        second_highest=highest;
        highest=salary;
    }
    else if (salary>second_highest){
        second_highest=salary;
    }
}
System.out.println("Highest salary: " +highest);
System.out.println("Second highest salary: " +second_highest);
sc.close();
 }
}