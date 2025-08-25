import java.io.*;
public class Ch7_179_10 {
    public static void main(String[] argus) throws IOException{
        float cost, amt, discount = 0;
        String gift = null;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader buff = new BufferedReader(isr);
        System.out.println("Please enter a value for the total cost");
        cost = Float.parseFloat(buff.readLine());
        if (cost <= 2000) {
            discount = 5;
            gift = "Calculator";
        } else if (cost >= 2001 && cost <= 5000) {
            discount = 10;
            gift = "School Bag";
        } else if (cost >= 5001 && cost <= 10000) {
            discount = 15;
            gift = "Wall clock";
        } else if (cost >= 10000) {
            discount = 20;
            gift = "Wrist watch";
        }
        amt = cost - (discount/100)*cost;
        System.out.println("Total Amount: Rs." + amt);
        System.out.println("Gift: " + gift);
    }
}