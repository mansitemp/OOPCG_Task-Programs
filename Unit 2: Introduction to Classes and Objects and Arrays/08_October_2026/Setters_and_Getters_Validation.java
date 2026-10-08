//Concept: Setters and Getters.
public class Setters_and_Getters_Validation {
    private String name;
    private int marks1;
    private int marks2;

    void Set_name (String name){
        this.name=name;}
    void Set_marks1 (int marks1){
        if (marks1>=0 && marks1<=100){
                this.marks1=marks1; //Else prints 0 as nothing is assigned to marks initially.
        }}
    void Set_marks2 (int marks2){
    if (marks2>=0 && marks2<=100){
            this.marks2=marks2;
    }}

    String Get_name(){
        return name;}
    int Get_marks1(){
        return marks1;}
    int Get_marks2(){
        return marks2;}

public static void main(String[] args) {
    Setters_and_Getters_Validation s1= new Setters_and_Getters_Validation();
    s1.Set_name ("xyz");
    s1.Set_marks1 (95);
    s1.Set_marks2 (150);
    System.out.println("Name: " +s1.Get_name());
    System.out.println("Valid marks input results into: " +s1.Get_marks1());
    System.out.println("Invalid marks input results into: " +s1.Get_marks2());
}}
