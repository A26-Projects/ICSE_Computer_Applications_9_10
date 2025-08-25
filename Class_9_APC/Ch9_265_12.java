public class Ch9_265_12 {
    public static void main(String[] argus) {
        System.out.println("The composite numbers from 1 to 100 are:");
        int n = 2;
        for(int i = 1; i <= 100; i++) {
            for(int j = 2; j <= i / n; j++) {
                if (i % j == 0) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
