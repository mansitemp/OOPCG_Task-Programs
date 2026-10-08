//Concept: Setters and Getters.
public class Setters_and_Getters_Student_Info {
    private String name;
    private int marks;
    void Set_name (String name){
        this.name=name;}
    void Set_marks (int marks){
        this.marks=marks;}
    String Get_name(){
        return name;}
    int Get_marks(){
        return marks;}

public static void main(String[] args) {
    Setters_and_Getters_Student_Info s1= new Setters_and_Getters_Student_Info();
    s1.name= "xyz";
    s1.marks= 85;
    System.out.println("Name: " +s1.Get_name());
    System.out.println("Marks: " +s1.Get_marks());
}}
