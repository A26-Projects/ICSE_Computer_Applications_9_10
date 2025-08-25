//importing the "java.util" package for the "Scanner" class
import java.util.Scanner;
public class Ch6_145_4 {
    public static void main(String[] args) {
        //declaring the required variables
        float phy, chem, bio, avg;
        //creating a new "Scanner" object to accept input from the user
        Scanner sc = new Scanner(System.in);
        //user input prompt
        System.out.println("Please enter the a value for the Physics marks");
        //accepting the user value for Physics marks and assigning it to "phy"
        phy = sc.nextFloat();
        //user input prompt
        System.out.println("Please enter the a value for the Chemistry marks");
        //accepting the user value for Chemistry marks and assigning it to "chem"
        chem = sc.nextFloat();
        //user input prompt
        System.out.println("Please enter the a value for the Biology marks");
        //accepting the user value for Biology marks and assigning it to "bio"
        bio = sc.nextFloat();
        //calculating the average marks
        avg = (phy + chem + bio)/3;
        //rounding all the marks using the "Math.round" method
        phy = Math.round(phy);
        chem = Math.round(chem);
        bio = Math.round(bio);
        //printing the average marks as well as rounded-off marks
        System.out.println("The average marks are: " + avg);
        System.out.println("The rounded-off physics marks are: " + phy);
        System.out.println("The rounded-off chemistry marks are: " + chem);
        System.out.println("The rounded-off biology marks are: " + bio);
    }
}