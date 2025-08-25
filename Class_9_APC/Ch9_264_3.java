import java.util.Scanner;
public class Ch9_264_3 {
    public static void main(String[] argus) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the value of \'n\'");
        int n = sc.nextInt();
        double sum = 0, num = 0, den = 1;
        for(int i = 2; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                num += j;
                den *= j;
            }
            sum += num/den;
            num = 0; den = 1;
        }
        System.out.println(sum);
    }
}
