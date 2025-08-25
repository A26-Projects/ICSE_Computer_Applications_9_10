
import java.util.Scanner;
public class CTA_PF2_Specimen_2025_Q3 {
    private double p, n, r, a;

    public static void main(String[] argus) {
        CTA_PF2_Specimen_2025_Q3 b = new CTA_PF2_Specimen_2025_Q3();
        b.accept();
        b.calculate();
        b.display();
    }

    public void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the Principal value and the time period in years respectively");
        p = sc.nextDouble();
        n = sc.nextDouble();
    }

    public void calculate() {
        if (n <= 0.5)
            r = 9;
        else if (n <= 1)
            r = 10;
        else if (n <= 3)
            r = 11;
        else
            r = 12;

        a = p * Math.pow( (1 + (r/100)), n);
    }

    public void display() {
        System.out.println("Principal\t\tTime\t\tRate\t\tAmount\t");
        System.out.println("Rs. " + p + "\t\t" + n + "yrs\t\t" + r + "%\tRs. " + a);

    }
}
