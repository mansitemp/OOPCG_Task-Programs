//Concept: Setters and Getters.
public class Setters_and_Getters_Validation {
    private String name;
    private int marks;

    void Set_name (String name){
        this.name=name;}
    void Set_marks (int marks){
        if (marks>=0){
            if (marks<=100){
                this.marks=marks; //Else prints 0 as nothing is assigned to marks initially.
        }}}
    String Get_name(){
        return name;}
    int Get_marks(){
        return marks;}

public static void main(String[] args) {
    Setters_and_Getters_Validation s1= new Setters_and_Getters_Validation();
    s1.Set_name ("xyz");
    s1.Set_marks (95);
    System.out.println("Name: " +s1.Get_name());
    System.out.println("Marks: " +s1.Get_marks());
}}
