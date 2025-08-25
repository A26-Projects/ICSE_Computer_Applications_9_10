import java.util.Scanner;
public class P387_10_Mobike {
    private String name;
    private int bno, phno, days, charge;

    public static void main(String[] argus) {
        P387_10_Mobike p = new P387_10_Mobike();
        p.input();
        p.compute();
        p.display();
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the name of the customer: ");
        name = sc.nextLine();
        System.out.print("Please enter the bike number: ");
        bno = sc.nextInt();
        System.out.print("Please enter the phone number of the customer: ");
        phno = sc.nextInt();
        System.out.print("Please enter the number of days for which the bike is rented: ");
        days = sc.nextInt();
    }

    public void compute() {
        if (days <= 5)
            charge = 500 * days;
        else if (days <= 10)
            charge = 500 * 5 + 400 * (days - 5);
        else
            charge = 500 * 5 + 400 * 5 + 200 * (days - 10);
    }

    public void display() {
        System.out.format("%-10s %-20s %-10s %-12s %-6s", "Bike No.", "Phone No.", "Name", "No. of days", "Charge\n");
        System.out.format("%-10s %-20s %-10s %-12s %-6s", bno, phno, name, days, charge);

    }
}
