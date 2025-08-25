import java.util.ArrayList;
import java.util.Scanner;
public class Ch8_230_4 {
    public static void main(String[] argus) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> five = new ArrayList<Integer>();
        ArrayList<Integer> zero = new ArrayList<Integer>();
        for (int i = 1; i <= 50; i++) {
            System.out.println("Please enter the number " + i);
            int x = sc.nextInt();
            if (x % 5 == 0) {
                if (x % 10 == 5) {
                    five.add(x);
                } else if (x % 10 == 0) {
                    zero.add(x);
                }
            }
        }
        System.out.println("The numbers ending with the digit 5 are: " + five);
        System.out.println("There are " + zero.size() + " numbers ending with the digit 0; they are: " + zero);
    }
}