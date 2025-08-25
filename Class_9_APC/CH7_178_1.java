//importing the "java.util" package for the Scanner class
import java.util.Scanner;
public class CH7_178_1 {
    public static void main(String[] argus) {
        //declaring required variables
        int a, b, c;
        //creating a new Scanner object to accept input from the user
        Scanner sc = new Scanner(System.in);
        //user input prompt
        System.out.println("Please enter three values for the angles of a triangle");
        //accepting values for the three angles of a triangle and assigning them to 'a', 'b', and 'c'
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        //if statement to check if triangle can be constructed
        if((a + b + c) == 180) {
            //nested if statement to check if triangle is right-angles
            if(a == 90 || b == 90 || c == 90) {
                //printing that triangle is right-angled if condition is true
                System.out.println("Right angled triangle");
                //else if statement to check if triangle is obtuse angled
            } else if(a > 90 || b > 90 || c > 90) {
                //printing that triangle is obtuse angles if condition is true
                System.out.println("Obtuse angled triangle");
                //printing that the triangle is acute angled if none of the above conditions are true
            } else {
                System.out.println("Acute angled triangle");
            }
            //printing that construction is not possible
        } else {
            System.out.println("Triangle is not possible");
        }
    }
}