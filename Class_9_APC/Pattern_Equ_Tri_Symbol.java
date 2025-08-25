import java.util.Scanner;
public class Pattern_Equ_Tri_Symbol {
    public static void main(String[] argus) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of rows");
        int x = sc.nextInt();
        int a = 1;
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <=(2*x-2*i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= a; k++) {
                System.out.print("* ");
            }
            System.out.print("\n");
            a+=2;
        }
    }
}