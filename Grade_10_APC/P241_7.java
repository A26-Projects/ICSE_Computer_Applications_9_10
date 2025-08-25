import java.util.Scanner;
public class P241_7 {
    public static void main(String[] argus) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[20];
        P241_7 p = new P241_7();
        for (int i = 0; i < 20; i++) {
            System.out.print("Please enter the element at position " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        int[] temp = new int[10];
        System.arraycopy(arr, 0, temp, 0, 10);
        temp = p.bubbleSort(temp, false);
        System.arraycopy(temp, 0, arr, 0, 10);
        System.arraycopy(arr, 10, temp, 0, 10);
        temp = p.bubbleSort(temp, true);
        System.arraycopy(temp, 0, arr, 10, 10);

        for(int x : arr)
            System.out.print(x + " ");
    }

    public int[] bubbleSort(int[] arr, boolean rev) {
        int len = arr.length, temp = 0;
        for (int j = 0; j < len; j++) {
            boolean swap = false;
            for (int i = 0; i < len - j - 1; i++) {
                if (rev ? arr[i] < arr[i + 1] : arr[i] > arr[i + 1]) {
                    swap = true;
                    temp = arr[i];
                    arr[i] = arr[i+ 1];
                    arr[i+1] = temp;
                }
            }
            if (!swap)
                break;
        }
        return arr;
    }
}
