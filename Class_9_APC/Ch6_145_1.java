//importing the "java.io" package for the InputStreamReader and BufferedReader classes
import java.io.*;
public class Ch6_145_1 {
    public static void main(String[] args) throws IOException{
        //declaring the required variables
        int a, b, c, max, min;
        //creating a new InputStreamReader object to streamiline the input bit pattern
        InputStreamReader isr = new InputStreamReader(System.in);
        //creating a new BufferedReader object to temporarily store the input data
        BufferedReader buff = new BufferedReader(isr);
        //user input prompt
        System.out.println("Please enter an integer");
        //aceepting an integer and assigning it to "a"
        a = Integer.parseInt(buff.readLine());
        //user input prompt
        System.out.println("Please enter another integer");
        //accepting another integer and assigning it to "b"
        b = Integer.parseInt(buff.readLine());
        //user input prompt
        System.out.println("Please enter yet another integer");
        //aceepting another integer and assigning it to "c"
        c = Integer.parseInt(buff.readLine());
        //finding the greatest number using a nested "Math.max" function
        max = Math.max(Math.max(a, b), c);
        //finding the smallest number using a nested "Math.min" function
        min = Math.min(Math.min(a, b), c);
        //printing the greatest number
        System.out.println("Greatest number: " + max);
        //printing the smallest number
        System.out.println("Smallest number: " + min);
    }
}