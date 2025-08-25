import java.util.Scanner;
public class CFQ_003_a {
	public static void main(String[] argus) {
		int a = 1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the number of rows: ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(a + " ");
				a++;
			}
			System.out.println();
		}
	}
}
