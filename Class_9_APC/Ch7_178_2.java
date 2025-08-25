//importing "java.io" package for the InputStreamReader and BufferedReader classes
import java.io.*;
public class Ch7_178_2 {
    public static void main(String[] argus) throws IOException{
        //declaring the required variables
        float sellp, costp, prof_loss, plpercent;
        //creating a new InputStreamReader object to streamline input bit pattern
        InputStreamReader isr = new InputStreamReader(System.in);
        //creating a new BufferedReader object to temporarily store input data
        BufferedReader buff = new BufferedReader(isr);
        //user input prompt
        System.out.println("Please enter values for the cost and selling price respectively");
        //accepting the values for cost and selling price and assigning them to 'costp' and 'sellp' respectively
        costp = Float.parseFloat(buff.readLine());
        sellp = Float.parseFloat(buff.readLine());
        //if statement to check if there is a profit
        if (costp < sellp) {
            //calculating profit
            prof_loss = sellp - costp;
            //calculating profit percent using formula
            plpercent = (prof_loss/costp)*100;
            //printing the results
            System.out.println("Profit: Rs." + prof_loss);
            System.out.println("Profit percent :" + plpercent + "%");
            //checking if there is a loss
        } else if (costp > sellp) {
            //calculating loss
            prof_loss = costp - sellp;
            //calculating loss percent using formula
            plpercent = (prof_loss/costp)*100;
            //printing the results
            System.out.println("Loss: Rs." + prof_loss);
            System.out.println("Los percent: " + plpercent + "%");
            //printing that there is no profit or loss if above conditions are false
        } else {
            System.out.println("Neither profit nor loss");
        }
    }
}