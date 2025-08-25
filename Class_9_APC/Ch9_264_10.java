import java.util.Scanner;
public class Ch9_264_10 {
    public static void main(String[] argus) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int x = sc.nextInt();
        int dig = 0, fac = 1;
        while (x != 0) {
            dig = x % 10;
            for(int i = dig; i > 1; i--) {
                fac *= i;
            }
            System.out.println("The factor of " + dig + " is: " + fac);
            dig = 0;
            fac = 1;
            x /= 10;
        }

    }
}
