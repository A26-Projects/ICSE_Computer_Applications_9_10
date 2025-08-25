import java.util.Scanner;
public class CFQ_005 {
	public static void main(String[] argus) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[3][3];
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				System.out.print("Please enter the element at index (" + i + ", " + j + "): ");
				arr[i][j] = sc.nextInt();
			}
		}
		for(int i = 0; i < arr.length; i++) {
			int sumR = 0, sumC = 0;
			for(int j = 0; j < arr[0].length; j++) {
				sumR += arr[i][j];
				sumC += arr[j][i];
			}
			if(sumR != 15 || sumC != 15) {
				System.out.println("It is not a Losho grid");
				System.exit(0);
			}
		}
		System.out.println("It is a Losho grid");
	}
}
