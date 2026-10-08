//Concept: Object refernce assignment.
public class Object_Reference_Assignment_Shop {
    String component;
    Double price;

        public static void main(String[] args) {
        Object_Reference_Assignment_Shop p1= new Object_Reference_Assignment_Shop();
        p1.component= "Laptop";
        p1.price= 50000.00;
        Object_Reference_Assignment_Shop p2= p1;
        p2.price= 45000.00;
        System.out.println("Name of first laptop: " +p1.price);
        System.out.println("Name of second laptop: " +p2.price);
        }}