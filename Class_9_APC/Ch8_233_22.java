import java.util.Scanner;
public class Ch8_233_22 {
    public static void main(String[] argus) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int x = sc.nextInt();
        int sum = 0, temp = x, i =1;
        while(temp != 0) {
            sum += temp % (int)Math.pow(10, i);
            temp /= (int)Math.pow(10, i);
            i++;
        }
        if (x % sum == 0) {
            System.out.println("It is a Niven number");
        } else {
            System.out.println("It is not a Niven number");
        }
        
    }
}