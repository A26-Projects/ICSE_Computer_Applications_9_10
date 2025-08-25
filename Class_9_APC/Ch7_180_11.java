import java.util.Scanner;
public class Ch7_180_11 {
    public static void main(String[] argus) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = sc.nextLine();
        System.out.println("Please enter your age");
        int age = sc.nextInt();
        if(age > 60) {
            System.out.println("Wrong Category");
            System.exit(0);
        }
        System.out.println("Please enter your taxable income");
        double ti = sc.nextDouble(), it = 0.0d;
        if (ti <= 250000) {
            it = 0.0d;
        } else if (ti <= 500000) {
            it = (ti - 160000) * (10.0d/100);
        } else if (ti <= 1000000) {
            it = (ti - 500000) * (20.0d/100) + 34000;
        } else {
            it = (ti - 1000000) * (30.0d/100) + 94000;
        }
        System.out.println("Name: " + name);
        System.out.println("Income Tax: Rs." + it);
    }
}
