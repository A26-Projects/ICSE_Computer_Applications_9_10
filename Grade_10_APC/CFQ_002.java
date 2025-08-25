import java.util.Scanner;
public class CFQ_002 {
    public static void main(String[] argus) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a four-digit number: ");
        int n = sc.nextInt();
        if(String.valueOf(n).length() != 4) {
            System.out.println("Error: Input is not a four-digit number. " + String.valueOf(n).length() + "-digit number entered");
            System.exit(0);
        }

        int sumAll = 0, sumFL = 0, temp = n;
        while (temp > 0) {
            sumAll += temp % 10;
            if(temp == n || temp < 10)
                sumFL += temp % 10;
            temp /= 10;
        }

        if(2 * sumFL == sumAll)
            System.out.println(n + " is an USHWA number!");
        else
            System.out.println(n + " is not an USHWA number!");
    }
}
