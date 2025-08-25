import java.util.Scanner;
public class P385_4_Discount {

    public static void main(String[] argus) {
        P385_4_Discount p = new P385_4_Discount();
        p.input();
        p.cal();
        p.display();
    }

    private int cost;
    private String name;
    private double dc, amt;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the customer's name and the cost of the item respectively");
        name = sc.nextLine();
        cost = sc.nextInt();
    }

    public void cal() {
        if (cost <= 5000) dc = 0;
        else if (cost <= 10000) dc = 10;
        else if (cost <= 15000) dc = 15;
        else dc = 20;
        dc *= cost/100.0;
        amt = cost - dc;
    }

    public void display() {
        System.out.format("%-24s %8s %8s", "Name of the customer", "Discount", "Amount\n");
        System.out.format("%-24s %8s %8s", name, dc, amt);
    }
}
