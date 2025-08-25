import java.util.Scanner;
public class Ch9_264_8 {
    public static void main(String[] argus) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = sc.nextInt();
        int n = 2;
        boolean prime = true;
        for(int i = 2; i <= num / n; i++) {
            if(num % i == 0) {
                prime = false;
                break;
            }
            n++;
        }
        if(prime) {
            boolean prime2 = true;
            int rev = 0, x = num, n1 = 2;
            while (x != 0) {
                rev = (rev * 10) + x % 10;
                x /= 10;
            }
            for(int i = 2; i <= rev / n1; i++) {
                if(rev % i == 0) {
                    prime2 = false;
                    break;
                }
                n1++;
            }
            if(prime2) {
                System.out.println(num + " and " + rev + " are both prime");
                System.out.println("Twisted Prime");
            } else {
                System.out.println("Not a Twisted Prime");
            }
        } else {
            System.out.println("Composite Number");
        }
    }
}
