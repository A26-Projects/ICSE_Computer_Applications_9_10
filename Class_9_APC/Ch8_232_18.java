import java.util.Scanner;
public class Ch8_232_18 {
    public static void main(String[] argus) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 1 to display the series 0, 3, 8, 15... upto 'n' terms\nPlease enter 2 to display the sum of the series 1/2 + 3/4 + 4/5...");
        int a = sc.nextInt();
        switch(a) {
            case 1:
                System.out.println("Please enter the number of terms");
                int n = sc.nextInt();
                for(int i = 1; i <= n; i++) {
                    System.out.print((2*i + 1) + ", ");
                }
                break;
            case 2:
                double sum = 0;
                for(double i = 1; i < 20; i += 2) {
                    sum += i/(i+1);
                }
                System.out.println("The sum is: " + sum);
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}