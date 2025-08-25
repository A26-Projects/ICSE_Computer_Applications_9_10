import java.util.Scanner;
public class BubbleSort {
    public static void main(String[] argus) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length");
        int len = sc.nextInt();
        int[] arr = new int[len];
        System.out.println("Enter the elements");
        for (int i = 0; i < len; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        int temp = 0;
        for (int j = 0; j < len; j++) {
            boolean swap = false;
            for (int i = 0; i < len - j - 1; i++) {
                if (arr[i] > arr[i+1]) {
                    swap = true;
                    temp = arr[i];
                    arr[i] = arr[i+ 1];
                    arr[i+1] = temp;
                }
            }
            if (!swap)
                break;
        }
        for(int i : arr) {
            System.out.print(i + " ");
        }
    }
}
