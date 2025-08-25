import java.util.Scanner;
public class P387_8_Loan {
    private int time;
    private double principal, rate, amt, interest;

    public static void main(String[] argus) {
        P387_8_Loan p = new P387_8_Loan();
        p.getdata();
        p.calculate();
        p.display();
    }

    public void getdata() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the principal: ");
        principal = sc.nextDouble();
        System.out.print("Please enter the time period of the loan: ");
        time = sc.nextInt();
    }

    public void calculate() {
        if (time <= 5)
            rate = 15;
        else if (time <= 10)
            rate = 12;
        else
            rate = 10;
        interest = (principal * rate * time)/100;
        amt = interest + principal;
    }

    public void display() {
        System.out.println();
        System.out.println("Interest: Rs. " + interest);
        System.out.println("Amount: Rs. " + amt);
    }
}
