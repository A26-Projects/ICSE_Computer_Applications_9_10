//importing "java.util" package for the Scanner class
import java.util.Scanner;
public class Ch7_178_3 {
    public static void main(String[] argus) {
        //declaring the required variables
        float x, y, z, great;
        //creating a new Scanner object to accept input from the user
        Scanner sc = new Scanner(System.in);
        //user input prompt
        System.out.println("Please enter three numbers");
        //accepting three numbers and assinging them to 'x', 'y', and 'z'
        x = sc.nextFloat();
        y = sc.nextFloat();
        z = sc.nextFloat();
        //if statement to check that all three numbers are not equal
        if (!(x == y && y == z)) {
            //calculating the greatest nu ber using the "Math.max()" methods
            great = Math.max(Math.max(x, y), z);
            //printing the greatest number
            System.out.println("The greatest number: " + great);
            //printing that the numbers are equal if the above condition is false
        } else {
            System.out.println("All three numbers are equal");
        }
    }
}