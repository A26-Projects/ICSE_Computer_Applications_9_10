import java.util.Scanner;
public class Ch8_233_23 {
    public static void main(String[] argus) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int x = sc.nextInt();
        int sum = 0, pro = 1, temp = x, i = 1;
        while(temp != 0) {
            sum += temp % (int)Math.pow(10, i);
            pro *= temp % (int)Math.pow(10, i);
            temp /= (int)Math.pow(10, i);
        }
        if (sum == pro) {
            System.out.println("It is a spy number");
        } else {
            System.out.println("It is not a spy number");
        }
    }
}