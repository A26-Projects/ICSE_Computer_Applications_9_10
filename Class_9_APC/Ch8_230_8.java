import java.util.Scanner;
public class Ch8_230_8 {
    public static void main(String[] argus) {
        float sum = 0;
        for (int i = 1; i <= 20; i++) {
            sum += (int)Math.pow(i, 2);
        }
        System.out.println("The sum of series (a) is: " + sum);
        sum = 0;
        for (int i = 1; i <= 20; i++) {
            sum += 1.0/i;
        }
        System.out.println("The sum of series (b) is: " + sum);
        sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += 1.0/((2*i)-1);
        }
        System.out.println("The sum of series (c) is: " + sum);
        sum = 0;
        for (float i = 1.0f; i < 20.0; i++) {
            sum += i/(i + 1);
        }
        System.out.println("The sum of series (d) is: " + sum);
        sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += (i % 2 == 0) ? -(2*i) : 2*i;
        }
        System.out.println("The sum of series (e) is: " + sum);
        sum = 0;
        for (float i = 1.0f; i < 20.0; i++) {
            sum += i*(i + 1);
        }
        System.out.println("The sum of series (f) is: " + sum);
    }
}