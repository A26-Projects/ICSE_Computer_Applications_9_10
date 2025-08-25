public class Ch9_265_15_D {
    public static void main(String[] argus) {
        for(int i = 5; i >= 1; i--) {
            for(int j = 1; j <= i; j++) {
                System.out.print((2 * j - 1) + "  ");
            }
            System.out.print("\n");
        }
    }
}
