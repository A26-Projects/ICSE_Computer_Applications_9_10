public class Ch9_265_15_J {
    public static void main(String[] argus) {
        for(int i = 1, n = 1; i <= 5; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(n + "  ");
                n++;
            }
            System.out.print("\n");
        }
    }
}
