import java.util.Scanner;
public class Ch9_264_9 {
    public static void main(String[] argus) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int x = sc.nextInt();
        int fac = 1;
        for (int i = x; i <= x + 9; i++) {
            for(int j = i; j > 1; j--) {
                fac *= j;
            }
            System.out.println("The factorial of " + i + " is: " + fac);
            fac = 1;
        }
    }
}
