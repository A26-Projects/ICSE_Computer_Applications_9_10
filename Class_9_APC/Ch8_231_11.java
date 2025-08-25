import java.util.Scanner;
public class Ch8_231_11 {
    public static void main(String[] argus) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int rem = a % b;
        while (rem != 0) {
            rem = a % b;
            a = b;
            if (rem == 0) {
                System.out.println("GCD: " + b);
            }
            b = rem;
        }
    }
}