import java.util.Scanner;
public class P421_10_Student {
    private String name;
    private int mm, scm, comp;

    public static void main(String[] argus) {
        P421_10_Student p = new P421_10_Student("Vivaan", 98, 94, 97);
        p.display();
    }

    public P421_10_Student(String n, int m, int s, int c) {
        name = n;
        mm = m;
        scm = s;
        comp = c;
    }

    public void check() {
        double avg = (mm + scm + comp) / 3.0;
        if (mm >= 90 && scm >= 90 && comp >= 90)
            System.out.print("Science with Computers");
        else if (avg >= 90)
            System.out.print("Bio-Science");
        else if (avg >= 80)
            System.out.print("Science with Hindi");
    }

    public void display() {
        System.out.print("Stream: ");
        check();
    }
}