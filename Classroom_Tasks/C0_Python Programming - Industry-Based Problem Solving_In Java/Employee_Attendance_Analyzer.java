 import java.util.Scanner;
 public class Employee_Attendance_Analyzer{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

    int present_days= 0;
    int absent_days= 0;

    System.out.println("Enter total working days: ");
    int total_working_days= sc.nextInt();
        
    for (int i=1; i<=total_working_days; i++){
        System.out.println("Enter attendance as 1 for present and 0 for absent: ");
        int attendance= sc.nextInt();
        
        if (attendance==1){
            present_days= present_days+1;
        }
        else if (attendance==0){
            absent_days= absent_days+1;
        }
        else{
            System.out.println("Invalid input!");
        }
    }
    System.out.println("Total present days: " +present_days);
    System.out.println("Total absent days: " +absent_days);

    double attendance_percentage=(present_days*100.0)/total_working_days;
    System.out.println(attendance_percentage);

    if (attendance_percentage>=75) {
        System.out.println("Employee is eligible for bonus");
    }
    else {
        System.out.println("Employee is not eligible for bonus");
    }
    sc.close();
    }
 }