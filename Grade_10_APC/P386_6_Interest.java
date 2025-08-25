import java.util.Scanner;
public class P386_6_Interest {
    private int p, t;
    private double interest, amt, r;

    public static void main(String[] argus) {
        P386_6_Interest p = new P386_6_Interest();
        p.input();
        p.cal();
        p.display();
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the Principal: ");
        p = sc.nextInt();
        System.out.print("Please enter the Time period: ");
        t = sc.nextInt();
    }

    public void cal() {
        if (t == 1)
            r = 6.5;
        else if (t == 2)
            r = 7.5;
        else if (t == 3)
            r = 8.5;
        else
            r = 9.5;
        interest = (p * r * t)/100;
        amt = p + interest;
    }

    public void display() {
        System.out.println("Principal: Rs. " + p);
        System.out.println("Interest: Rs. " + interest);
        System.out.println("Amount to be paid: Rs. " + amt);
    }
}
