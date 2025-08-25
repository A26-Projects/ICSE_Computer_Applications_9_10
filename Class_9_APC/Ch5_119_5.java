//importing the "java.io" package for the InputStreamReader and BufferedReader classes
import java.io.*;
public class Ch5_119_5 {
    public static void main(String[] args) throws IOException {
        //declaring and initialising the variables with the given value(s)
        float principal, amount, rate = 5, comp_int;
        //creating a new InputStreamReader object to streamiline the input bit pattern
        InputStreamReader isr = new InputStreamReader(System.in);
        //creating a new BufferedReader object to temporarily store the input data
        BufferedReader buff = new BufferedReader(isr);
        //user input prompt
        System.out.println("Please enter a value for the principal");
        //accepting the user input for the principal and assigning it to "principal"
        principal = Float.parseFloat(buff.readLine());
        //creating a for loop to calculate the interest through iteration
        for (int time = 1; time <= 3; time++) {
            //calculating amount throught the formula
            amount = ((100 + rate)/100)*principal;
            //calculating the compund interest
            comp_int = amount - principal;
            //printing the interest for that year
            System.out.println("The interest for year " + time + " is Rs." + comp_int);
            //assinging the value of the previous year's amount to the next year's principal
            principal = amount;
        }
    }
}