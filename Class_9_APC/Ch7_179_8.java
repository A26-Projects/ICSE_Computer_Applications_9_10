//importing the "java.io" package for the InputStreamReader and BufferedReader classes
import java.io.*;
public class Ch7_179_8 {
    public static void main(String[] argus) throws IOException{
        //declaring the required variables
        int x, y, z, great, small;
        //creating a new InputStreamReader object to streamline input bit pattern
        InputStreamReader isr = new InputStreamReader(System.in);
        //creating a new BufferedReader object to temporarily store the input data
        BufferedReader buff = new BufferedReader(isr);
        //user input prompt
        System.out.println("Please enter three unequal numbers");
        //accepting user values and assigning them to 'x', 'y' and 'z'
        x = Integer.parseInt(buff.readLine());
        y = Integer.parseInt(buff.readLine());
        z = Integer.parseInt(buff.readLine());
        //calculating the smallest number using the "Math.min()" method
        small = Math.min(Math.min(x, y), z);
        //calculating the greatest number using the "Math.max()" method
        great = Math.max(Math.max(x, y), z);
        //printing the results
        System.out.println("The smallest number is: " + small);
        System.out.println("The greatest number is: " + great);
    }
}
