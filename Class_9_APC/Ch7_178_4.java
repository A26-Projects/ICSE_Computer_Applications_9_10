//importing the "java.io" package for the InputStreamReader and BufferedReader classes
import java.io.*;
public class Ch7_178_4 {
    public static void main(String[] argus) throws IOException{
        //declaring the required variable(s)
        int x;
        //creating a new new InputSreamReader object to streamline the input bit pattern
        InputStreamReader isr = new InputStreamReader(System.in);
        //creating a new BufferedReader object to temporarily store the input data
        BufferedReader buff = new BufferedReader(isr);
        //user input prompt
        System.out.println("Please enter an integer");
        //accepting the user input and assinging it to 'x'
        x = Integer.parseInt(buff.readLine());
        //if statement to check if the number is not divisible by both 3 and 5
        if (!((x % 3 == 0) && (x % 5 == 0))) {
            //nested if statement to check if the number is divisible by 3
            if (x % 3 == 0) {
                //printing that the number is divisible by 3
                System.out.println(x + " is divisible by 3 only");
                //nested if statement to check if the number is divisible by 5
            } else if (x % 5 == 0) {
                //printing that the number is divisible by 5
                System.out.println(x + " is divisible by 5 only");
                //printing that the number is not divisible by 5 or 3 if the above conditions are false
            } else {
                System.out.println(x + " is divisible by neither by 5 nor 3");
            }
            //printing that the number is divisible by both 5 and 3 if the above condition is false
        } else {
            System.out.println(x + " is divisible by both 5 and 3");
        }
    }
}