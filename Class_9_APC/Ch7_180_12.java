import java.util.Scanner;
public class Ch7_180_12 {
    public static void main(String[] argus) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of days");
        int days = sc.nextInt();
        System.out.println("Please enter the sum of money");
        double sum = sc.nextDouble();
        double rate = 0.0d, amt = 0.0d;
        if(days <= 180) {
            rate = 5.5d;
        } else if (days < 365) {
            rate = 7.5d;
        } else if (days == 365) {
            rate = 9.0d;
        } else {
            rate = 8.0d;
        }
        amt = sum + ((sum * rate * (days/360.0d))/100.0d);
        System.out.println("The amount is: " + amt);
    }
}
