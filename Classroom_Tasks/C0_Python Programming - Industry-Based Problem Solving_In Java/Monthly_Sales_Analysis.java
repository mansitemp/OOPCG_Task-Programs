import java.util.Scanner;

public class Monthly_Sales_Analysis{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

int total_sales= 0;
int highest_sales= 0;
int lowest_sales= 0;
int high_sales_months= 0;

for (int month=1; month<=12; month++){
System.out.print("Enter sales for month " +month +":");
int sales= sc.nextInt();

    if (month == 1){
        highest_sales = sales;
        lowest_sales = sales;}

    if (sales > highest_sales){
        highest_sales = sales;}

    else if (sales < lowest_sales){
        lowest_sales = sales;}
    
    if (sales > 100000){
        high_sales_months = high_sales_months + 1;}

    total_sales += sales;}

int average_sales= total_sales/12;
int high_sales_percentage= (high_sales_months/12)*100;

System.out.println("Total annual sales: " +total_sales);
System.out.println("Average monthly sales: " +average_sales);
System.out.println("Highest monthly sales: " +highest_sales);
System.out.println("Lowest monthly sales: " +lowest_sales);
System.out.println("High-sales months:" +high_sales_months);
System.out.println("Percentage of high-sales months:" +high_sales_percentage +"%");

sc.close();
    }
}
