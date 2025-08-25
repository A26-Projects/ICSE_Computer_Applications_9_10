import java.util.Scanner;
public class Ch9_265_14 {
    public static void main(String[] argus) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the value of 'n'");
        int n = sc.nextInt();
        //Series 1
        double sum = 0;
        for(int i = 1; i <= n; i++) {
            long fac = 1;
            for(int j = i; j > 1; j--) {
                fac *= j;
            }
            sum += (1.0d/fac);
        }
        System.out.println("The sum of series 1 is: " + sum);

        //Series 2
        sum = 0;
        for(int i = 1; i<= n; i++) {
            for(int j = 1; j <= i; j++) {
                sum += j;
            }
        }
        System.out.println("The sum of series 2 is: " + (int)sum);

        //Series 3
        sum = 0; long temp = 1;
        for(int i = 1; i<= n; i++) {
            for(int j = 1; j <= i; j++) {
                temp *= j;
            }
            sum += temp;
            temp = 1;
        }
        System.out.println("The sum of series 3 is: " + (int)sum);

        //Series 4
        sum = 0;
        for(int i = 1; i <= n; i++) {
            temp = 0;
            for(int j = 1; j <= i; j++) {
                temp += j;
            }
            sum += (1.0d/temp);
        }
        System.out.println("The sum of series 4 is: " + sum);

        //Series 5
        sum = 0;
        for(int i = 2; i <= 30; i++) {
            boolean prime = true;
            for(int j = 2; j <= i / 2; j++) {
                if(i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if(prime) { sum += (1.0d/i); }
        }
        System.out.println("The sum of series 5 is: " + sum);
    }
}
