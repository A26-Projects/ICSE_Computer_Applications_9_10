public class CTA_PF2_Specimen_2025_Q8 {

    void display() {
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 5; j++) {
                System.out.print(j % 2 == 0 ? 1 : 2);
            }
            System.out.println();
        }
    }

    void display(int m, int n) {
        if(m > n)
            System.out.println("M divided by N gives: " + m / n);
        else
            System.out.println("2N + 3M = " + (2*n + 3*m));
    }

    void display(double a, double b, double c) {
        double p = (a + b)/c;
        double q = a + b + c;
        double z = p * q;
        System.out.println("Z = (A + B)/C * (A + B + C) = " + z);
    }

}
