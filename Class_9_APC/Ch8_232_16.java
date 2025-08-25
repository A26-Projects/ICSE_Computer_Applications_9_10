import java.util.Scanner;
public class Ch8_232_16 {
    public static void main(String[] argus) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int x = sc.nextInt();
        System.out.println("Enter 1 to check if the number is a palindrome");
        System.out.println("Enter 2 to check if the number is a perfect number");
        int a = sc.nextInt();
        switch (a) {
            case 1:
                int reverse = 0, org = x;
                while (org != 0) {
                    reverse = reverse * 10 + org % 10;
                    org /= 10;
                }
                System.out.println("It is " + ( (reverse == x) ? "a" : "not a" ) + " palindrome");
                break;
            case 2:
                int sum = 0;
                for (int i = 1; i <= x / 2; i++) {
                    if (x % i == 0) {
                        sum += i;
                    }
                }
                System.out.println("It is " + ( (sum == x) ? "a" : "not a" ) + " perfect number");
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}