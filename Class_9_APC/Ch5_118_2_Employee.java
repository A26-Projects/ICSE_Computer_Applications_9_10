//importing the "java.util" package for the "Scanner" class
import java.util.Scanner;
public class Ch5_118_2_Employee {
    public static void main(String[] args) {
        //declaring the variables for the various fields
        float basic_pay, net_pay, gross_pay, dearness_allowance, house_rent_allowance, provident_fund;
        //initialising all the varibles with the given values
        dearness_allowance = 30;
        house_rent_allowance = 15;
        provident_fund = 12.5f;
        //creaing a new Scanner object to accept input from the user
        Scanner sc = new Scanner(System.in);
        //user input prompt
        System.out.println("Please enter a value for the basic pay");
        //accept basic pay value from user and assigning it to "basic_pay"
        basic_pay = sc.nextFloat();
        //calculating the gross pay after adding allowances
        gross_pay = basic_pay + (dearness_allowance/100)*basic_pay + (house_rent_allowance/100)*basic_pay;
        //calculating the net pay after deduction of provident fund
        net_pay = gross_pay - (provident_fund/100)*basic_pay;
        //printing the gross and net pay values
        System.out.println("The gross pay is Rs." + gross_pay);
        System.out.println("The net pay is Rs." + net_pay);
    }
}