import java.util.Scanner;
public class Ch9_264_6 {
    public static void main(String[] argus) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 1 to print the prime numbers from 1 to 100");
        System.out.println("Please enter 2 to print the composite numbers from 1 to 100");
        int a = sc.nextInt();
        boolean printPrime = true, prime = true;
        switch(a) {
            case 1:
                printPrime = true;
                break;
            case 2:
                printPrime = false;
                System.out.println(1);
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
        for(int i = 2; i <= 100; i++) {
            for (int j = 2; j <= i / 2; j++) {
                if(i % j == 0) {
                    prime = false;
                    if (!printPrime) { System.out.println(i); }
                    break;
                }
                prime = true;
            }
            if(prime) {
                if(printPrime) { System.out.println(i); }
            }
            
        }
    }
}