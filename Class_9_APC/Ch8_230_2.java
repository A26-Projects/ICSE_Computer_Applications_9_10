import java.util.Scanner;
import java.util.ArrayList;
public class Ch8_230_2 {
    public static void main(String[] argus) {
        Scanner sc = new Scanner(System.in);
        int pos_sum = 0, neg_sum = 0, zer = 0;
        ArrayList<Integer> pos = new ArrayList<Integer>();
        ArrayList<Integer> neg = new ArrayList<Integer>();
        for (int i = 1; i <= 50; i++) {
            System.out.println("Please enter number " + i);
            int x = sc.nextInt();
            if (x > 0) {
               pos.add(x);
               pos_sum += x;
            } else if (x < 0) {
                neg.add(x);
                neg_sum += x;
            } else {
                zer++;
            }
        }
        System.out.println("The number of positive numbers are: " + pos.size() + ", they are: " + pos);
        System.out.println("The number of negative numbers are: " + neg.size() + ", they are: " + neg);
        System.out.println("The sum of positive numbers is: " + pos_sum);
        System.out.println("The sum of negative numbers is: " + neg_sum);
        System.out.println("The number of zeroes are: " + zer);
    }
}