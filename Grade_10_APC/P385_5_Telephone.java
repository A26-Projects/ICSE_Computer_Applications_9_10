import java.util.Scanner;
public class P385_5_Telephone {
    private int pre, prv, call;
    private double amt, total;
    private String name;

    public static void main(String[] argus) {
        P385_5_Telephone p = new P385_5_Telephone();
        p.input();
        p.cal();
        p.display();
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the previous reading: ");
        prv = sc.nextInt();
        System.out.print("Please enter the present reading: ");
        pre = sc.nextInt();
        System.out.print("Please enter the name of the customer: ");
        sc.nextLine();
        name = sc.nextLine();
    }

    public void cal() {
        call = pre - prv;
        if (call <= 100)
            amt = 0;
        else if (call <= 200)
            amt = 0.9 * (call - 100);
        else if (call <= 400)
            amt = 0.9 * 100 + 0.8 * (call - 200);
        else
            amt = 0.9 * 100 + 0.8 * 200 + (call - 400) * 0.7;
        total = amt + 180;
    }

    public void display() {
        System.out.format("%-24s %16s %24s", "Name of the customer", "Calls made", "Amount to be paid\n");
        System.out.format("%-24s %16s %24s", name, call, total);
    }
}
