import java.util.Scanner;
public class Ch9_265_11 {
    public static void main(String[] argus) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int x = sc.nextInt();
        int dig = 0, i = 1;
        while (x != 0) {
            dig = x % 10;
            System.out.println(dig + " to the power of " + i + " is: " + (int)Math.pow(dig, i));
            x /= 10;
            i++;
        }
    }
}
