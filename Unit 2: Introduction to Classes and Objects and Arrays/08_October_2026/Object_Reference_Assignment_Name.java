//Concept: Object refernce assignment.
public class Object_Reference_Assignment_Name {
    String name;

        public static void main(String[] args) {
        Object_Reference_Assignment_Name s1= new Object_Reference_Assignment_Name();
        Object_Reference_Assignment_Name s2= s1;
        s1.name= "xyz";
        System.out.println("Name in first object: " +s1.name);
        System.out.println("Name in second object: " +s2.name);
        }}