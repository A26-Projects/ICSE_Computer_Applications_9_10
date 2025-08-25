import java.util.Scanner;
public class Ch8_232_19 {
    public static void main(String[] argus) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 1 to display the first ten terms in the Fibonacci Series\nPLease enter 2 to display the sum of the digits of a number");
        int a = sc.nextInt();
        switch(a) {
            case 1:
                int x = 0;
                int y = 1;
                for (int i = 1; i <= 5; i++) {
                    System.out.print(x + ", ");
                    x += y;
                    System.out.print(y + ", ");
                    y += x;
                }
                break;
            case 2:
                System.out.println("Please enter a number");
                int c = sc.nextInt(), sum = 0;
                while (c != 0) {
                    sum += c % 10;
                    c /= 10;
                }
                System.out.println("Sum of the digits = " + sum);
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}