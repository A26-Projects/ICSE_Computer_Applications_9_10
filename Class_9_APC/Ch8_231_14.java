import java.util.Scanner;
public class Ch8_231_14 {
    public static void main(String[] argus) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the values for the time period, rate and principal respectively");
        double t = sc.nextDouble();
        double r = sc.nextDouble();
        double p = sc.nextDouble();
        double amt = 0;
        for (double i = 1; i <= t; i++) {
            amt = p + ((p*r)/100);
            System.out.println("Amount after " + i + " year(s): " + amt);
            p = amt;
        }
        System.out.println(amt);
    }
}