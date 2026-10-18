 public class Prime_Number_Detector{
    public static void main(String[] args) {
    System.out.println("Prime numbers between 1 and 50 are:");
    
for (int dividend=2; dividend<=50; dividend++){
    boolean prime= true;

    for (int divisor=2; divisor*divisor<=dividend; divisor++){
        if ((dividend % divisor)== 0){
            prime= false;
            break;}}
        if (prime) {
        System.out.println(dividend);}
}
 }
}