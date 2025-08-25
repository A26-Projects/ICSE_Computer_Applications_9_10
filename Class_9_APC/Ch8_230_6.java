import java.util.Scanner;
public class Ch8_230_6 {
    public static void main(String[] argus) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the lower and upper limits");
        int p = sc.nextInt(), q = sc.nextInt();
        if (p > q) {
            System.out.println("Invalid input");
        }
        System.out.println("The Buzz numbers are: ");
        for (int i = p; i <= q; i++) {
            if (i % 10 == 7 || i % 7== 0) {
                System.out.println(i);
            }
        }
    }
}