public class CFQ_003_b {
	public static void main(String[] argus) {
		int sum = 0;
		for (int i = 1; i <= 20; i++) {
			for (int j = 1; j <= i; j++)
				sum += j;	
		}
		System.out.println(sum);
	}
}
