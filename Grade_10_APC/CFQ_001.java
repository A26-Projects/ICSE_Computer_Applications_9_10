import java.util.Scanner;
public class CFQ_001 {
    private double pAmt, amt, rate;
    private int n, emi;

    public static void main(String[] argus) {
        CFQ_001 c = new CFQ_001();
        c.input();
        c.compute();
        c.print();
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the Purchase Amount: ");
        pAmt = sc.nextDouble();
        System.out.print("Please enter the number of months: ");
        n = sc.nextInt();
    }

    public void compute() {
        rate = pAmt < 20000 ? 12 : 15;
        amt = pAmt * Math.pow((1 + rate/100), n);
        emi = (int) Math.round(amt/n);
    }

    public void print() {
        System.out.println("Purchase Amount: Rs. " + pAmt);
        System.out.println("Rate of Interest: " + rate + "%");
        System.out.println("Amount with Interest: Rs. " + amt);
        System.out.println("EMI: Rs. " + emi);
    }
}
