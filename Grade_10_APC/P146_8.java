import java.util.Scanner;
public class P146_8 {
    public static void main(String[] argus) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int x = sc.nextInt();
        P146_8 p = new P146_8();
        boolean harshadOne = x % p.digitSum(x) == 0;
        boolean harshadTwo = p.digitSum(x) % p.digitSum(p.digitSum(x)) == 0;
        System.out.println(x + " is " + (harshadTwo && harshadOne ? "" : "not ") + "a Multiple Harshad Number");
    }

    public int digitSum(int n) {
        int sum = 0;
        while( n > 0 ) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
