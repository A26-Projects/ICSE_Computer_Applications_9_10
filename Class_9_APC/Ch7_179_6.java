//importing the "java.io" package for the InputStreamReader and BufferedReader classes
import java.io.*;
public class Ch7_179_6 {
    public static void main(String[] argus) throws IOException {
        //declaring the required variables
        int x, y;
        //creating a new InputStreamReader object to streamline input bit pattern
        InputStreamReader isr = new InputStreamReader(System.in);
        //creating a new BufferedReader object to temporarily store the input data
        BufferedReader buff = new BufferedReader(isr);
        //user input prompt
        System.out.println("Please enter two positive integers");
        //accepting the user inputs and assigning them to 'x', and 'y'
        x = Integer.parseInt(buff.readLine());
        y = Integer.parseInt(buff.readLine());
        //if statement to check that both numbers are positive
        if (x >= 0 && y >= 0) {
            //nested if statement to check if both numbers are perfect squares 
            if (Math.sqrt(x) == Math.rint(Math.sqrt(x)) && Math.sqrt(y) == Math.rint(Math.sqrt(y))) {
                //printing that both are perfect squares if above condition is true
                System.out.println("They are perfect square numbers");
                //checking if either of the numbers are perfect squares
            } else {
                //checking if value of 'x' is a perfect square
               if (Math.sqrt(x) == Math.rint(Math.sqrt(x))) {
                  System.out.println(x + " is a perfect square number");
                  //printing the following message if 'x' is not a perfect square
                } else {
                    System.out.println(x + " is not a perfect square number");
                }
                //checking if value of 'y' is a perfect square
               if (Math.sqrt(y) == Math.rint(Math.sqrt(y))) {
                   System.out.println(y + " is a perfect square number");
                   //printing the following message if 'y' is not a perfect square
               } else {
                   System.out.println(y + " is not a perfect square number");
               }
            }
            //printing this message if one of the numbers or both are negative
        } else {
            System.out.println("Square roots of negative numbers are not possible.. Please try again");
        }
    }
}