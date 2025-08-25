//importing the "java.util" package for the Scanner class
import java.util.Scanner;
public class Ch7_179_5 {
    public static void main(String[] argus) {
        //declaring the variable(s)
        int year;
        //creating a new Scanner object to accept input from the user
        Scanner sc = new Scanner(System.in);
        //user input prompt
        System.out.println("Please enter an year");
        //accepting user input and assinging it to 'year'
        year = sc.nextInt();
        //if statement to see if the year is divisible by 4
        if (year % 4 == 0) {
            //nested if statement to check that year is not divisible by 100
            if (year % 100 != 0) {
                //printing that year is a leap year
                System.out.println("It is a leap year");
                //checking if year is divisble by 100 and 400
            } else if (year % 400 == 0) {
                //printing that year is a century leap year
                System.out.println("It is a century leap year");
                //if year is divisble by 100 and 4 but not 400, printing that year is a century, but not leap year
            } else {
                System.out.println("Century year but not leap year");
            }
            //printing that the year is not a leap year if above conditions are false
        } else {
            System.out.println("It is not a leap year");
        }
    }
}