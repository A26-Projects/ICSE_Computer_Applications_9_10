import java.util.Scanner;
import java.util.ArrayList;
public class Ch8_230_5 {
    public static void main(String[] argus) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> squares = new ArrayList<Integer>();
        System.out.println("Please enter the lower and upper limits");
        int m = sc.nextInt();
        int n = sc.nextInt();
        if (m < 0 || m > n || n < 0) {
            System.out.println("Invalid inputs");
        }
        System.out.print("The numbers between " + m + " and " + n + " are: ");
        for (int i = m; i <= n; i++) {
            System.out.println(i);
            if (Math.sqrt(i) == Math.rint(Math.sqrt(i))) {
                squares.add(i);
            }
        }
        System.out.println("\nThe perfect squares are: " + squares);
    }
}