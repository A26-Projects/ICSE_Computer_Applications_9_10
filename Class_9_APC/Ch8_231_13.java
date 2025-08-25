import java.util.Scanner;
public class Ch8_231_13 {
    public static void main(String[] argus) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the height of the pole");
        double h = sc.nextDouble();
        double jump = 5, rem = h - jump;
        int no = 1;
        while (rem > 0) {
            jump *= (1 - (2/100)); 
            rem -= jump;
            no++;
        }
        System.out.println("Number of attempts: " + no);
    }
}