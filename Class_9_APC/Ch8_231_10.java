import java.util.Scanner;
public class Ch8_231_10 {
    public static void main(String[] argus) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int x = sc.nextInt(), reverse = 0, org = x;
        for (int i = 1; x != 0; i++) {
            reverse = reverse * 10 + x % 10;
            x /= 10; 
        }
        System.out.println("The reversed numbers is: " + reverse);
        System.out.println("The absolute difference is: " + (int)Math.abs(org - reverse));
    }
}