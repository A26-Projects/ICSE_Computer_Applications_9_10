//importing the "java.io" package for the InputStreamReader and BufferedReader classes
import java.io.*;
public class Ch6_145_5 {
    public static void main(String[] args) throws IOException{
        float area, radius;
        //creating a new InputStreamReader object to streamiline the input bit pattern
        InputStreamReader isr = new InputStreamReader(System.in);
        //creating a new BufferedReader object to temporarily store the input data
        BufferedReader buff = new BufferedReader(isr);
        //user input prompt
        System.out.println("Please enter a value for the area of the circle");
        //Accepting a user input value for the area of the circle and assinging it to "area"
        area = Float.parseFloat(buff.readLine());
        //calculating the radius using the given formula
        radius = (float)Math.sqrt(area/Math.PI);
        //printing the radius
        System.out.println("The radius of a circle with an area of " + area + " is " + radius);
    }
}