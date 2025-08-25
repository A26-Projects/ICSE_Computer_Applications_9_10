//importing the "java.io" package for the InputStreamReader and BufferedReader classes
import java.io.*;
public class Ch5_119_9 {
    public static void main(String[] args) throws IOException {
        //declaring and initialising the required variables to calculate compound and simple interest
        double principal, comp_int, amount, time = 3, rate = 10, simple_int, final_val;
        //creating a new InputStreamReader object to streamiline the input bit pattern
        InputStreamReader isr = new InputStreamReader(System.in);
        //creating a new BufferedReader object to temporarily store the input data
        BufferedReader buff = new BufferedReader(isr);
        //user input prompt
        System.out.println("Please enter a value for the principal");
        //accpeting the user input value for the principal and assigning it to "principal"
        principal = Double.parseDouble(buff.readLine());
        //calculating the simple interest using the formula
        simple_int = (((principal*time)*rate)/100);
        //calculating the amount using the compund interest formula
        amount = principal*Math.pow(((100 + rate)/100), time);
        //calculating compund interest
        comp_int = amount - (principal);
        //printing the simple interest
        System.out.println("The simple interest on Rs." + principal + " for " + time + " years at " + rate + "% per annum is Rs." + (float)simple_int);
        //printing the compund interest
        System.out.println("The compound interest on Rs." + principal + " for " + time + " years at " + rate + "% per annum is Rs." +(float)comp_int);
        final_val = comp_int - simple_int;
        //printing difference between compound interest and simple interest
        System.out.println("Rs." + final_val + " is the difference between the compound interest and simple interst");
    }
}