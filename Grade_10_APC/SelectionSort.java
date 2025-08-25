import java.util.Scanner;
public class SelectionSort {
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
        for (int i = 0; i < len-1; i++) {
            int min = i;
            for(int j = i + 1; j < len; j++) {
                if (arr[j] < arr[min])
                    min = j;
            }
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        for(int i : arr) {
            System.out.print(i + " ");
        }
    }
}