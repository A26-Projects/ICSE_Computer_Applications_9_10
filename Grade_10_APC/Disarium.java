import java.util.Scanner;
public class Disarium {
    public static void main(String[] argus) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int n = sc.nextInt();
        int sum = 0;
        String s = String.valueOf(n);
        for(int i = 0; i < s.length(); i++) sum += (int)Math.pow((int)s.charAt(i), i + 1);

        if(sum == n) System.out.println(n + " is a Disarium Number!");
        else System.out.println(n + " is not a Disarium Number!");
    }
}
/*int temp = n, place = 1, sum = 0, rev = 0;
        while(temp > 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        temp = rev;
        while(temp > 0) {
            sum += (int)Math.pow(temp % 10, place);
            place++;
            temp /= 10;
        }*/