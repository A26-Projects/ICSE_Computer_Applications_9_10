//importing the "java.util" package for the "Scanner" class
import java.util.Scanner;
public class Ch5_119_10 {
    public static void main(String[] args) {
        //declaring and initialising the required variables
        float sell_p, cost_p, profit_loss = 20;
        //creating a new "Scanner" object to accept input from the user
        Scanner sc = new Scanner(System.in);
        //user input prompt
        System.out.println("Please enter the selling price");
        //accepting a value for the Selling Price and assigning it to "sell_p"
        sell_p = sc.nextFloat();
        //calculating the cost price when there is a loss
        cost_p = (sell_p)/(1 - (profit_loss/100));
        //calculating the cost price when there is a profit as well as the total cost price
        cost_p += (sell_p)/(1 + (profit_loss/100));
        //printing the total cost price
        System.out.println("The total cost price is Rs." + cost_p);
    }
}