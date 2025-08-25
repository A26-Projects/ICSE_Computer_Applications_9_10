//importing the "java.util" package for the "Scanner" class
import java.util.Scanner;
public class Ch5_119_8 {
    public static void main(String[] args) {
        //declaring the variables for the swap
        int a, b;
        //creating a new "Scanner" object to accept input from the user
        Scanner sc = new Scanner(System.in);
        //user input prompt
        System.out.println("Please enter an integral number");
        //accepting user input and assigning it to "a"
        a = sc.nextInt();
        //user input prompt
        System.out.println("Please enter another integral number");
        //accepting user input and assinging it to "b"
        b = sc.nextInt();
        //printing the values of both variables before the swapping
        System.out.println("Before Swapping: a = " + a + " and b = " + b);
        //assgning the sum of the values of "a" and "b" to "a"
        a += b;
        //assigning the original value of "a" to "b:
        b = a - b;
        //assigning "a" the original value of "b"
        a -= b;
        //printing the values of both variables after the swapping
        System.out.println("After Swapping: a = " + a + " and b = " + b);
    }
}