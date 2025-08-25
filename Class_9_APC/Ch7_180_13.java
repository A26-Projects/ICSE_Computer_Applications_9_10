import java.util.Scanner;
public class Ch7_180_13 {
    public static void main(String[] argus) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the name of policy holder: ");
        String name = sc.nextLine();
        System.out.println("Please enter the sum assured: ");
        double sum = sc.nextDouble();
        System.out.println("Please enter the annual premium: ");
        double prem = sc.nextDouble();
        double com, disc;
        if (sum <= 100000) {
            disc = 5; com = 2;
        } else if( sum <= 200000) {
            disc = 8; com = 3;
        } else if (sum <= 500000) {
            disc = 10; com = 5;
        } else {
            disc = 15; com = 7.5;
        }
        disc = (prem * disc)/100;
        com = (sum * com)/100;
        System.out.println("Name of the policy holder: " + name);
        System.out.println("Sum assured: Rs. " + sum);
        System.out.println("Premuim: Rs. " + prem);
        System.out.println("Discount on first premium: Rs. " + disc);
        System.out.println("Comission of the agent: Rs. " + com);
    }
}
