import java.util.Scanner;
public class P146_7 {
    public static void main(String[] argus) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int x = sc.nextInt();
        int temp = x, sum = 0;
        while (temp > 9) {
            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }
            temp = sum;
            sum = 0;
        }
        System.out.println(x + " is " + (temp == 1 ? "" : "not ") + "a Magic Number");
    }
}
