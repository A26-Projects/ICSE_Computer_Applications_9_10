public class Ch9_265_15_I {
    public static void main(String[] argus) {
        for(int i = 5; i > 0; i--) {
            for(int j = 5; j >= i; j--) {
                System.out.print((2 * j - 1) + "  ");
            }
            System.out.print("\n");
        }
    }
}
