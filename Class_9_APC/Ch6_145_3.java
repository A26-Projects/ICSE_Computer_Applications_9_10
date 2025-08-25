//importing the "java.io" package for the InputStreamReader and BufferedReader classes
import java.io.*;
public class Ch6_145_3 {
    public static void main(String[] args) throws IOException {
        //declaring all the required variables
        float x, ln, abs, sqrt, cube, rand;
        //creating a new InputStreamReader object to streamiline the input bit pattern
        InputStreamReader isr = new InputStreamReader(System.in);
        //creating a new BufferedReader object to temporarily store the input data
        BufferedReader buff = new BufferedReader(isr);
        //user input prompt
        System.out.println("Please enter a number");
        //accepting a number and assigning it to "x"
        x = Float.parseFloat(buff.readLine());
        //finding the natural logarithm using the "Math.log" method
        ln = (float)Math.log(x);
        //finding the absolute using the "Math.abs" method
        abs = Math.abs(x);
        //finding the square root using the "Math.sqrt" method
        sqrt = (float)Math.sqrt(x);
        //finding the cube using the "Math.pow" method
        cube = (float)Math.pow(x, 3);
        //finding a random number between 1 and the value of "x"
        rand = (float)(Math.random()*x) + 1;
        //printing the results
        System.out.println("Natural Logarithm of " + x + ": " + ln);
        System.out.println("Absolute value of " + x + ": " + abs);
        System.out.println("Square root of " + x + ": " + sqrt);
        System.out.println("Cube of " + x + ": " + cube);
        System.out.println("Random value between 1 and " + x + ": " + rand);
        
    }
}