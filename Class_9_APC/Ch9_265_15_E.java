public class Ch9_265_15_E {
    public static void main(String[] argus) {
        for(int i = 5; i >= 1; i--) {
            for(int j = 5; j >= i; j--) {
                System.out.print(j + "  ");
            }
            System.out.print("\n");
        }
    }
}
