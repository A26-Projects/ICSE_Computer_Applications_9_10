//importing the "java.util" package for the "Scanner" class
import java.util.Scanner;
public class Ch5_119_4 {
    public static void main(String[] args) {
        //declaring and initialising the variables with the given values
        float discount_1 = 30, succ_1 = 20, succ_2 = 10, price, final_price;
        //creating a new "Scanner" object to accept input from the user
        Scanner sc = new Scanner(System.in);
        //user input prompt
        System.out.println("Please enter a value for the printed price");
        //accepting user input for the printed price and assigning it to "price"
        price = sc.nextFloat();
        //calculating the final amount with the single discount
        final_price = price - (discount_1/100)*price;
        //printing the final amount
        System.out.println("The final amount on the printed price of " + price + " with a single discount of " + discount_1 + "% is Rs." + final_price);
        
        //converting the two successive discounts into a single discount
        discount_1 = (succ_1 + succ_2) - ((succ_1*succ_2)/100);
        //calculating the amount using the new single discount
        final_price = price - (discount_1/100)*price;
        //printing the final amount
        System.out.println("The final amount on the printed price of " + price + " with successive discounts of " + succ_1 + "% and " + succ_2 + "% is Rs." + final_price);
        
    }
}