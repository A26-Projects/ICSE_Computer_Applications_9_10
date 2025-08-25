public class Ch9_264_4_B {
    public static void main(String[] argus) {
        for(int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print(j + " ");
            }
            System.out.print("\n");
        }
    }
}