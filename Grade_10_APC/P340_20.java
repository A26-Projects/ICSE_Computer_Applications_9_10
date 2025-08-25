public class P340_20 {
    public double series(double n) {
        double sum = 0;
        for (int i = 1; i <= n; i++) { sum += 1.0/i; }
        return sum;
    }

    public double series(double a, double n) {
        double sum = 0, x = 1;
        for (int i = 1; i <= n; i++) {
            sum += x/Math.pow(a, x + 1);
            x += 3;
        }
        return sum;
    }
}
