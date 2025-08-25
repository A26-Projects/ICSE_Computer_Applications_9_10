import java.util.Scanner;
public class P242_15 {
    public static void main(String[] argus) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[4][4];
        for (int i  = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print("Please enter the element at position (" + i + ", " + j + "): "); 
                arr[i][j] = sc.nextInt();
            }
        }
        int evenSum = 0, oddSum = 0;
        for (int[] x : arr) 
            for (int y : x) 
                if (y % 2 == 0) evenSum += y; else oddSum += y;
        System.out.println("Sum of even elements: " + evenSum);
        System.out.println("Sum of odd element: " + oddSum);
    }
}