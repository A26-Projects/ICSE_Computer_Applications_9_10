import java.util.Scanner;
public class P241_9 {
    public static void main(String[] argus) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[20];
        for (int i = 0; i < 20; i++) {
            System.out.print("Please enter the element at position " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.print("The perfect squares are: ");
        for (int x : arr)
            if (Math.sqrt(x) == Math.rint(Math.sqrt(x)))
                System.out.print(x + " ");
    }
}
