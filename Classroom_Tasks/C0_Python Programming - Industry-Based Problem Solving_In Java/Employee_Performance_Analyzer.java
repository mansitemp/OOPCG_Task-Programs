import java.util.Scanner;
 public class Employee_Performance_Analyzer{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

int highest_score = 0;
int lowest_score = 100;
int i;
String category;

for (i=1; i<=6; i++){
    System.out.println("Enter performance score: ");
    int score= sc.nextInt();

    if (score >= 90){
        category= "Excellent";}
    else if (score >= 75){
        category= "Good";}
    else if (score >= 50){
        category= "Average";}
    else{
        category= "Poor";}

    System.out.println("Employee " +i + ":" + category);

    if (score > highest_score){
        highest_score = score;}

    if (score < lowest_score){
        lowest_score = score;}}

System.out.println("Highest score:" + highest_score);
System.out.println("Lowest score:" + lowest_score);
sc.close();
    }}