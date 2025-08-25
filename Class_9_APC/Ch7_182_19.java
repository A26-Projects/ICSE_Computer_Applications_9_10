import java.util.Scanner;
public class Ch7_182_19 {
    public static void main(String[] argus) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the sum, rate per anum and time in years respectively");
        double p = sc.nextDouble();
        double r = sc.nextDouble();
        double t = sc.nextDouble();
        double intr;
        System.out.println("Pleas enter 'S' for Simple Interest and 'C' for Compound Interest");
        char a = sc.next().charAt(0);
        switch(a) {
            case 'S':
                intr = (p * r * t)/100;
                System.out.println("The simple interest is: Rs. " + intr);
                System.out.println("The amount: Rs. " + (intr + p));
                break;
            case 'C':
                intr = p * (Math.pow((1 + (r/100)), t) - 1);
                System.out.println("The compound interest is: Rs. " + intr);
                System.out.println("The amount: Rs. " + (intr + p));
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }
}
