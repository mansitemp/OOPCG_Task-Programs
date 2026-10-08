//Concept: Returning an object from a method.
class Returning_Object_From_Method {
    String name;
    int marks;}

    class Stu_factory{
        Returning_Object_From_Method Create_stu(){
            Returning_Object_From_Method s= new Returning_Object_From_Method(); 
            s.name="xyz";
            s.marks= 95;
            return s;}

public static void main(String[] args) {
    Stu_factory f1= new Stu_factory();  //Creates a Stu_factory object.
    Returning_Object_From_Method s1= f1.Create_stu();  
    System.out.println("The name is " +s1.name);
    System.out.println("The marks are " +s1.marks);
}}
