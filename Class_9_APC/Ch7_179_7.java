//importing the "java.util" package for the Scanner class
import java.util.Scanner;
public class Ch7_179_7 {
    public static void main(String[] argus) {
        //declaring the required variables
        int x, y, z, second_small;
        //creating a new Scanner object to accept user input
        Scanner sc = new Scanner(System.in);
        //user input prompt
        System.out.println("Please enter three unequal numbers");
        //accepting user values and assigning them to 'x', 'y' and 'z'
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();
        //calculating the second smallest number using the "Math.min()" and "Math.max()" methods
        second_small = Math.min(Math.max(x, y), z);
        //printing the result
        System.out.println("The second smallest number is: " + second_small);
    }
}