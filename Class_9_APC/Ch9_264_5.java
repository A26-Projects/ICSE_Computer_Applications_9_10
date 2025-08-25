import java.util.Scanner;
public class Ch9_264_5 {
    public static void main(String[] argus) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the values of \'m\' and \'n\' respectively, where they are both positive and m < n");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int fac = 1;
        if( m < 0 || n < 0 || m > n) {
            System.out.println("Invalid input");
        }
        for(int i = m; i <= n; i++) {
            for(int j = i; j > 1; j--) {
                fac *= j;
            }
            System.out.println("The factorial of " + i + " is: " + fac);
            fac = 1;
        }
    }
}