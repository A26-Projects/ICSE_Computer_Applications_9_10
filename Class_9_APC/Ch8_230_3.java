import java.util.Scanner;
public class Ch8_230_3 {
    public static void main(String[] argus) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Please enter the lower and upper limit");
        int m = sc.nextInt();
        int n = sc.nextInt();
        if (m > n) { System.out.println("Invalid input");}
        int even = 0, odd = 0;
        for (int i = m; i <= n; i++) {
            if (i % 2 == 0) {
                even += i;
            } else {
                odd += i;
            }
        }
        System.out.println("Sum of odd numbers is: " + odd);
        System.out.println("Sum of even numbers is: " + even);
    }
}