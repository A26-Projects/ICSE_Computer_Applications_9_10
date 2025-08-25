import java.util.Scanner;
public class Ch7_182_20 {
    public static void main(String[] argus) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = sc.nextLine();
        System.out.print("Please enter the amount of purchase: ");
        double amt = sc.nextDouble(), disc, net;
        System.out.println("Please enter 'L' if you bought a laptop and 'D' for a Desktop PC");
        char a = sc.next().charAt(0);
        if(amt <= 25000) {
            disc = a == 'L' ? 0 : 5;
        } else if (amt <= 50000) {
            disc = a == 'L' ? 5 : 7.5d;
        } else if (amt <= 100000) {
            disc = a == 'L' ? 7.5d : 10;
        } else {
            disc = a == 'L' ? 10 : 15;
        }
        net = amt * (1 - (disc/100));
        System.out.println("Name: " + name);
        System.out.println("Net amount: Rs. " + net);
    }
}
