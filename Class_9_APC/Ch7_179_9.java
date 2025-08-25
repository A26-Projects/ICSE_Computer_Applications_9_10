//importing "java.util" package for the Scanner class
import java.util.Scanner;
public class Ch7_179_9 {
    public static void main(String[] argus) {
        //declaring and inistialising the variables
        float dist, amt = 0;
        //creating a new Scanner object to accept user input
        Scanner sc = new Scanner(System.in);
        //user input prompt
        System.out.println("Enter a value for the distance in km");
        //aceepting the user value and assigning it to 'dist'
        dist = sc.nextFloat();
        //if statement to check if distance is less than 5km
        if (dist < 5) {
            //assigning the tariff to 'amt'
            amt = 100;
            //if statement to check if distance is more than 5km but less than 15km
        } else if (dist >= 5 && dist < 15) {
            //assigning the tariff to 'amt'
            amt = 10*dist;
            //if statement to check if distance is more than 15km but less than 25km
        } else if (dist >= 15 && dist < 25) {
            //assigning the tariff to 'amt'
            amt = 8*dist;
            //if statement to check if distance is more than 25km
        } else if (dist >= 25) {
            //assigning the tariff to 'amt'
            amt = 5*dist;
        }
        //printing the bill
        System.out.println("Taxi Number: 62660381034");
        System.out.println("Distance covered: " + dist + "km");
        System.out.println("Amount: Rs." + amt);
    }
}