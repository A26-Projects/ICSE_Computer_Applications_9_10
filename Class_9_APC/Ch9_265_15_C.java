public class Ch9_265_15_C {
    public static void main(String[] argus) {
        for(int i = 1; i <= 5; i++) {
            for(int j = 5; j >= i; j--) {
                System.out.print(j + "  ");
            }
            System.out.print("\n");
        }
    }
}
