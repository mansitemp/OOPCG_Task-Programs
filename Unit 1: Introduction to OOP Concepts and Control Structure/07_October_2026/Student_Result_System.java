import java.util.Scanner;
 public class Student_Result_System{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

    System.out.println("Enter student name: ");
    String stu_name= sc.nextLine();

    System.out.println("Enter marks scored in Mathematics:");
    int math= sc.nextInt();
    System.out.println("Enter marks scored in Science:");
    int science= sc.nextInt();
    System.out.println("Enter marks scored in English:");
    int english= sc.nextInt();
    System.out.println("Enter marks scored in Social Studies:");
    int sst= sc.nextInt();
    System.out.println("Enter marks scored in Hindi:");
    int hindi= sc.nextInt();
    
    int obtained_marks= math +science +english +sst +hindi;
    System.out.println("Total marks obtained: " +obtained_marks);

    int total_percentage= (obtained_marks*100)/500;
    System.out.println("Total percentage: " +total_percentage);

    if (total_percentage>=90){
        System.out.println("Grade A+");
    }
    else if (total_percentage>=80){
        System.out.println("Grade A");
    }
    else if (total_percentage>=70){
        System.out.println("Grade B");
    }
    else if (total_percentage>=60){
        System.out.println("Grade C");
    }
    else if (total_percentage>=40){
        System.out.println("Grade D");
    }
    else{
        System.out.println("Fail!");
    }
    
sc.close();}}