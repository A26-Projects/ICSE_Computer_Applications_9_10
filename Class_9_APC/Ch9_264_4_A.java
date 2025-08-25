import java.util.Scanner;
public class Ch9_264_4_A {
    public static void main(String[] argus) {
        for(int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(((j % 2 == 0) ? "#" : "*") + " ");
            }
            System.out.print("\n");
        }
    }
}