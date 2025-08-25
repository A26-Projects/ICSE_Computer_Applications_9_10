import java.util.Scanner;
public class Ch7_181_15 {
    public static void main(String[] argus) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 1 to convert temperature from Celsius to Fahrenheit and 2 for the inverse");
        int a = sc.nextInt();
        double c, f;
        switch(a) {
            case 1:
                System.out.println("Please enter the temperature in Celsius");
                c = sc.nextDouble();
                f = (1.8 * c) + 32;
                System.out.println("The temperature is: " + f + " degrees Fahrenheit");
                break;
            case 2:
                System.out.println("Please enter the temperature in Fahrenheit");
                f = sc.nextDouble();
                c = (5.0d/9) *  (f - 32);
                System.out.println("The temperature is: " + c + " degrees Celsius");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }
}
