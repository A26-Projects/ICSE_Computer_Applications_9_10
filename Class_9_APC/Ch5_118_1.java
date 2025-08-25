//importing the "java.io" package for the InputStreamReader and BufferedReader classes
import java.io.*;
public class Ch5_118_1 {
    public static void main(String[] args) throws IOException{
        //creating a new InputStreamReader object to streamiline the input bit pattern
        InputStreamReader isr = new InputStreamReader(System.in);
        //creating a new BufferedReader object to temporarily store the input data
        BufferedReader buff = new BufferedReader(isr);
        //declaring and initialising variables
        float pi = 22/7, l, g;
        //accepting input from the user for the effective length value and assigning it to "l"
        System.out.println("Enter a value for the effective length");
        l = Float.parseFloat(buff.readLine());
        //accepting input from the user for the acceleration due to gravity value and assigning it to "g"
        System.out.println("Enter a value for the acceleration due to gravity");
        g = Float.parseFloat(buff.readLine());
        //calculating time period using the formula
        double T = 2*pi*Math.sqrt(l/g);
        //printing the calculated time period
        System.out.println("The time period when effective length is " + l + " and acceleration due to gravity is " + g + " is " + T); 
    }
}