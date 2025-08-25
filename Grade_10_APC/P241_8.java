import java.util.Scanner;
public class P241_8 {
    public static void main(String[] argus) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[20];
        for (int i = 0; i < 20; i++) {
            System.out.print("Please enter the element at position " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        P241_8 p = new P241_8();
        arr = p.bubbleSort(arr);
        int index = 0;
        for(int i = 0; i < arr.length; i++)
            if(arr[i] % 2 == 0 && arr[i+ 1] % 2 != 0) {
                index = i;
                break;
            }
        int[] even = new int[index + 1];
        int[] odd = new int[arr.length - index - 1];
        System.arraycopy(arr, 0, even, 0, index + 1);
        System.arraycopy(arr, index + 1, odd, 0, arr.length - (index + 1));
        System.out.print("Even elements: ");
        for (int x : even) System.out.print(x + " ");
        System.out.println();
        System.out.print("Odd elements: ");
        for (int x : odd) System.out.print(x + " ");
    }

    public int[] bubbleSort(int[] arr) {
        int len = arr.length, temp = 0;
        for (int j = 0; j < len; j++) {
            boolean swap = false;
            for (int i = 0; i < len - j - 1; i++) {
                if (arr[i] % 2 != 0 && arr[i + 1] % 2 == 0) {
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
