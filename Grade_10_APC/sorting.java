import java.util.Arrays;

public class sorting {
    public static void main(String[] argus) {
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) arr[i] = (int)(Math.random()*201) - 100;
        
        String[] arrSorts = {"no", "bubble", "selection", "insertion", "merge", "quick"};
        for(String x : arrSorts) printArr(arr, x);
    }

    public static void printArr(int[] arr, String sort) {
        long start, end;
        int[] result = switch (sort) {
            case "bubble" -> BubbleSort(arr);
            case "selection" -> SelectionSort(arr);
            case "insertion" -> InsertionSort(arr);
            case "merge" -> MergeSort(arr);
            case "quick" -> QuickSort(arr);
            case "no" -> arr;
            default -> null;
        };

        System.out.println(sort + " sort:\n" + Arrays.toString(result) + "\n");
    }

    public static boolean isSorted(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) if (arr[i] > arr[i + 1]) return false;
        return true;
    }

    public static int[] BubbleSort(int[] arr) {
        int[] arrLocal = Arrays.copyOf(arr, arr.length);
        int temp = 0;

        for(int i = 0; i < arrLocal.length - 1; i++) {
            boolean swap = false;
            for(int j = 0; j < arrLocal.length - i - 1; j++) {
                if (arrLocal[j] > arrLocal[j + 1]) {
                    temp = arrLocal[j];
                    arrLocal[j] = arrLocal[j + 1];
                    arrLocal[j + 1] = temp;
                    swap = true;
                }
            }
            if(!swap) break;
        }
        return arrLocal;
    }

    public static int[] SelectionSort(int[] arr) {
        int[] arrLocal = Arrays.copyOf(arr, arr.length);
        int temp = 0;

        for(int i = 0; i < arrLocal.length - 1; i++) {
            int min = i;
            for(int j = i + 1; j < arrLocal.length; j++) if (arrLocal[j] < arrLocal[min]) min = j;
            temp = arrLocal[i];
            arrLocal[i] = arrLocal[min];
            arrLocal[min] = temp;
        }

        return arrLocal;
    }

    public static int[] InsertionSort(int[] arr) {
        int[] arrLocal = Arrays.copyOf(arr, arr.length);

        for (int i = 0; i < arrLocal.length; i++) {
            int currentValue = arrLocal[i];
            int insertIndex = i;
            int j = i - 1;

            while(j >= 0 && arrLocal[j] > currentValue) {
                arrLocal[j + 1] = arrLocal[j];
                insertIndex = j;
                j--;
            }
            arrLocal[insertIndex] = currentValue;
        }

        return arrLocal;
    }

    public static int[] MergeSort(int[] arr) {
        if (arr.length <= 1) return arr;

        int mid = arr.length/2;
        int[] leftArr = Arrays.copyOfRange(arr, 0, mid);
        int[] rightArr = Arrays.copyOfRange(arr, mid, arr.length);

        int[] sortedLeft = MergeSort(leftArr);
        int[] sortedRight = MergeSort(rightArr);

        return sortMerge(sortedLeft, sortedRight);
    }

    public static int[] sortMerge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int i = 0, j = 0, k= 0;

        while(i < left.length && j < right.length) {
            if(left[i] < right[j]) result[k++] = left[i++];
            else result[k++] = right[j++];
        }

        while (i < left.length) result[k++] = left[i++];
        while (j < right.length) result[k++] = right[j++];

        return result;
    }

    public static int[] QuickSort(int[] arr) { return arr; }

}
