import java.util.Scanner;
public class Switch_Case_Calculator{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

    //Declaring variables
        System.out.println("Enter first number:");
        Double num1= sc.nextDouble();
        System.out.println("Enter second number:");
        Double num2= sc.nextDouble();

    //Displaying menu and getting user's choice
        System.out.println("Select an operation to be performed:");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        int operation =sc.nextInt();

    //Using switch case
    switch (operation) {
        case 1:
            System.out.println("Sum:" + (num1+num2));
            break;
        case 2:
            System.out.println("Difference:" + (num1-num2));
            break;
        case 3:
            System.out.println("Product:" + (num1*num2));
            break;
        case 4:
            if (num2==0){
                System.out.println("Error: Division by zero isn't allowed");
            }
            else {
            System.out.println("Quotient:" + (num1/num2));
        }
            break;
        default:
            System.out.println("Invalid");
            break;
        }
    
    sc.close();
}
}
