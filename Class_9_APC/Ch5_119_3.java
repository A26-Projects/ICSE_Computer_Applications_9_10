//importing the "java.io" package for the InputStreamReader and BufferedReader classes
import java.io.*;
public class Ch5_119_3 {
    public static void main(String[] args) throws IOException {
        //declaring and initialising the discoutnt and GST variables with the given values
        float discount = 10, gst = 6;
        //creating a new InputStreamReader object to streamiline the input bit pattern
        InputStreamReader isr = new InputStreamReader(System.in);
        //creating a new BufferedReader object to temporarily store the input data
        BufferedReader buff = new BufferedReader(isr);
        //user input prompt
        System.out.println("Please enter a value for the printed price");
        //accepting a value for the printed price from the user and assigning it to "price"
        //decalring the "final_price" and "temp" variables
        float price = Float.parseFloat(buff.readLine()), final_price, temp;
        //calculating value after discount
        temp = price - ((discount/100)*price);
        //calculating final price after GST
        final_price = temp + ((gst/100)*temp);
        //printing the calculated final price
        System.out.println("The amount to be paid by the customer on the printed price of Rs." + price + " is Rs." + final_price);
    }
}