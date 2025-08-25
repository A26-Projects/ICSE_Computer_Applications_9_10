import java.util.Scanner;
public class Ch7_181_18 {
    public static void main(String[] argus) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the values of r1 and r2");
        double r1 = sc.nextDouble();
        double r2 = sc.nextDouble();
        double R;
        System.out.println("Please enter 1 to calculate equivalent resistance in a series cicuit and 2 for a parallel circuit");
        int a = sc.nextInt();
        switch(a) {
            case 1:
                R = r1 + r2;
                System.out.println("Equivalent resistance in a series circuit is: " + R);
                break;
            case 2:
                R = (r1 * r2)/(r1 + r2);
                System.out.println("Equivalent resistance in a parallel circuit is: " + R);
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }
}
