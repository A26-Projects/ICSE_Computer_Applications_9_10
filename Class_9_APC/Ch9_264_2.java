import java.util.Scanner;
public class Ch9_264_2 {
    public static void main(String[] argus) {
        Scanner sc = new Scanner(System.in);
        for(int i = 1; i<= 20; i++) {
            System.out.println("Please enter number: " + i);
            int x = sc.nextInt();
            int n = 2;
            boolean isPrime = true;
            for(int j = 2; j <= x / n; j++) {
                if (x % j == 0) {
                    isPrime = false;
                    break;
                }
                n++;
            }
            System.out.println(((isPrime) ? "Prime" : "Composite") + " number");
        }
    }
}