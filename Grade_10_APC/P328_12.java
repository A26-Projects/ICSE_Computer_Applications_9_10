import java.util.Scanner;
public class P328_12 {
    public static void main(String[] argus) {
        P328_12 p = new P328_12();
        p.SumSeries();
    }

    public void SumSeries(int n, double x) {
        double sum = 0, y = 1, z = 2, temp = 0;
        for (int i = 1; i <= n; i++) {
            sum += x/(y) * (i % 2 == 0 ? -1 : 1);
            temp = y;
            y = z;
            z += temp;
        }
        System.out.println("Sum of the given series is: " + sum);
    }

    public void SumSeries() {
        long sum = 1, fact = 1;
        for (int i = 20; i > 1; i--) {
            sum = sum * i + 1;
        }
        System.out.println("Sum of first 20 factorials is: " + sum);
    }
}
