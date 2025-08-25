import java.util.Scanner;
public class Ch8_231_9 {
    public static void main(String[] argus) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int x = sc.nextInt(), no = 0;
        for (int i = 1; x != 0; i++) {
            x -= x % (int)Math.pow(10, i);
            no++;
        }
        System.out.println("Number of digits = " + no);
        System.out.println("The number contains " + ((no % 2 == 0) ? "even" : "odd") + " number of digits");
    }
}