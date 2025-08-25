import java.util.Scanner;
public class Ch8_232_15 {
    public static void main(String[] argus) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter two positive numbers, in ascending order");
        int n = sc.nextInt();
        int m = sc.nextInt();
        if (n > m || m < 0 || n < 0) {
            System.out.println("Invalid input");
        } else {
        System.out.println("Please enter 1 to display the sum of the numbers, 2 to display the product, and 3 to display the quotient and remainder");
        int a = sc.nextInt();
        switch(a) {
            case 1:
                while (n > 0) {
                    m++;
                    n--;
                }
                System.out.println("The sum of the numbers is: " + m);
                break;
            case 2:
                int p = 0;
                while (n > 0) {
                    p += m;
                    n--;
                }
                System.out.println("The product of the numbers is: " + p);
                break;
            case 3:
                int rem = 0, quo = 0;
                while (m >= n) {
                    quo++;
                    m -= n;
                }
                rem = m;
                System.out.println("The quotient is: " + quo);
                System.out.println("The remainder is: " + rem);
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
    }
    }
}