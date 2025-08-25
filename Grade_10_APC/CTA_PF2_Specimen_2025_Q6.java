import java.util.Scanner;
public class CTA_PF2_Specimen_2025_Q6 {

    public static void main(String[] argus) {
        CTA_PF2_Specimen_2025_Q6 c = new CTA_PF2_Specimen_2025_Q6();
        c.input();
        c.display();
    }

    private int[][] arr = new int[4][4];

    void input() {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                System.out.print("Please enter the element at position (" + i + ", " + j + "): ");
                arr[i][j] = sc.nextInt();
            }
        }
    }

    void display() {
        int sum = 0;
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                sum += arr[i][j];
            }
            System.out.println("Sum of row " + i + ": " + sum);
            sum = 0;
        }
    }
}
