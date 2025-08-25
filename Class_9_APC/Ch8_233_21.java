import java.util.Scanner;
public class Ch8_233_21 {
    public static void main(String[] argus) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 1 to display all the factors of a number(excluding itself)");
        System.out.println("Please enter 2 to display the factorial of a (non-negative) number");
        int a = sc.nextInt();
        System.out.println("Please enter a number");
        int x = sc.nextInt();
        switch(a) {
            case 1:
                int n = 1;
                for (int i = 1; i <= x / n; i++) {
                    if (x % i == 0) {
                        System.out.print(i + " ");
                        n++;
                    }
                }
                break;
            case 2:
                int fac = 1;
                for (int i = x; i > 1; i--) {
                    fac *= i;
                }
                System.out.println("Factorial: " + fac);
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }
}