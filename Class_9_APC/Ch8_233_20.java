import java.util.Scanner;
public class Ch8_233_20 {
    public static void main(String[] argus) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int x = sc.nextInt();
        int sum = 0, pro = 1, temp = 0, c = x;
        for(int i = 1; x != 0; i++) {
            temp = x % (int)Math.pow(10, i);
            sum += temp;
            pro *= temp;
            x /= (int)Math.pow(10, i);
        }
        if(sum + pro == c) {
            System.out.println("Special Two-digit number");
        } else {
            System.out.println("Not a special Two-digit number");
        }
    }
}