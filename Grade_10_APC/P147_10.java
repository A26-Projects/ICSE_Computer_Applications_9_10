import java.util.Scanner;
public class P147_10 {
    public static void main(String[] argus) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 1 for a triangle and 2 for an inverted triangle");
        System.out.print("Please enter your choice: ");
        int n = sc.nextInt();
        System.out.print("Please enter the number of terms: ");
        int t = sc.nextInt();
        switch (n) {
            case 1:
                for (int i = 1; i <= t; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print(i + " ");
                    }
                    System.out.println();
                }
                break;
            case 2:
                for (int i = t; i >= 1; i--) {
                    for (int j = i; j >= 1; j--) {
                        System.out.print(i + " ");
                    }
                    System.out.println();
                }
                break;
            default:
                System.out.println("Invalid Choice!");
        }
    }
}
