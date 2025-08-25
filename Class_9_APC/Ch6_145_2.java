//importing the "java.util" package for the "Scanner" class
import java.util.Scanner;
public class Ch6_145_2 {
    public static void main(String[] args) {
        //declaring the required variables
        float base, perpendicular, hypotenuse;
        //creating a new "Scanner" object to accept input from the user
        Scanner sc = new Scanner(System.in);
        //user input prompt
        System.out.println("Please enter a value for the base of the right-angled triangle");
        //accepting the value for the base of the right-angled triangle and assigning it to "base"
        base = sc.nextFloat();
        //user input prompt
        System.out.println("Please enter a value for the perpendicular of the right-angled triangle");
        //accepting the value for the perpendicular of the right-angled triangle and assigning it to "perpendicular"
        perpendicular = sc.nextFloat();
        //calculating the hypotenuse using the formula
        hypotenuse = (float)Math.sqrt(Math.pow(base, 2) + Math.pow(perpendicular, 2));
        //printing the value of the hypotenuse
        System.out.println("The length of the hypotenuse when the base and the perpendicular are " + base + " and " + perpendicular + " respectively, is: " + hypotenuse);
    }
}