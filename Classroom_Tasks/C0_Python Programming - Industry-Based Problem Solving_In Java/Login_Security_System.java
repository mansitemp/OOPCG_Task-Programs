import java.util.Scanner;
 public class Login_Security_System{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

    int correct_password= 9009;
    int max_attempts= 3;

for (int attempts=1; attempts<=3; attempts++){
    System.out.println("Enter password: ");
    int password= sc.nextInt();

    if (password==correct_password){
        System.out.println("Login Successful");
        break;
    }
    else {
        System.out.println("Incorrect Password!");;
    }
    if (attempts==max_attempts) {
        System.out.println("Account Locked");
    }
}
sc.close();
 }
}