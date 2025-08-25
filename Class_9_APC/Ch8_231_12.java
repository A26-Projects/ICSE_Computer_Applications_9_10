import java.util.Scanner;
public class Ch8_231_12 {
    public static void main(String[] argus) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Please enter the value of a, n and x according to the question");
       int a = sc.nextInt();
       int n = sc.nextInt();
       int x = sc.nextInt();
       double sum = 0;
       for(int i = 1; i <= 10; i++) {
           sum += Math.pow(a, 2)/i;
       }
       System.out.println("The sum of the series is: " + sum);
       sum = 0;
       for(int i = 1; i <= 10; i++) {
           sum += Math.pow(a, i)/i;
       }
       System.out.println("The sum of the series is: " + sum);
       sum = 0;
       for(int i = 2; i <= 20; i++) {
           sum += a*i;
       }
       System.out.println("The sum of the series is: " + sum);
       sum = 0;
       for(int i = 1; i <= n; i++) {
           sum += Math.pow(a, i);
       }
       System.out.println("The sum of the series is: " + sum);
       sum = 0;
       for(int i = 1; i <= n; i++) {
           sum += Math.pow(i, i)/Math.pow(a, i - 1);
       }
       System.out.println("The sum of the series is: " + sum);
       sum = 0;
       for(int i = 1; i <= n; i++) {
           sum += Math.pow(2*i - 1, 2)/Math.pow(a, i);
       }
       System.out.println("The sum of the series is: " + sum);
       sum = 0;
       for(int i = 1; i <= n; i++) {
           sum += 1/Math.pow(a, i);
       }
       System.out.println("The sum of the series is: " + sum);
       sum = 0;
       for(double i = 2; i <= 20; i+=3) {
           sum += x/i;
       }
       System.out.println("The sum of the series is: " + sum);
    }
}