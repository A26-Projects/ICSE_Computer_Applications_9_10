import java.util.Scanner;
public class Ch8_233_24 {
    public static void main(String[] argus) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 1 for the sum of the series\nPlease enter 2 to display the series");
        int a = sc.nextInt();
        switch(a) {
            case 1:
                int sum = 0, x = 2;
                for (int i = 1; i <= 20; i++) {
                    sum += ((i % 2 == 0) ? -1 : 1) * (int)Math.pow(x, i);
                }
                System.out.println("Sum: " + sum);
                break;
            case 2:
                int temp0 = 0, temp1 = 0;
                for (int i = 0; i < 5; i++) {
                    temp1 = (int)Math.pow(10, i);
                    temp0 += temp1;
                    System.out.print(temp0 + ((i != 4) ? ", " : " "));
                    
                }
        }
    }
}