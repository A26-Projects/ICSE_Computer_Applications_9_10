import java.util.Scanner;
public class Ch8_232_17 {
    public static void main(String[] argus) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int x = sc.nextInt();
        System.out.println("Please enter 1 to check if the number is a prime number;\n2 to check if it is an automorphic number");
        int a = sc.nextInt();
        switch (a) {
            case 1:
                int n = 2;
                boolean isPrime = true;
                for (int i = 2; i <= x/n; i++) {
                    if (x % i == 0) {
                        System.out.println("Not a prime number");
                        isPrime = false;
                        break;
                    } else {
                        n++;
                        isPrime = true;
                    }
                }
                if (isPrime) { System.out.println("Prime number"); }
                break;
            case 2:
                int sq = x*x, temp = sq, b = 0;
                boolean isNoAuto = true;
                for (int i = 1; b == 1; i++) {
                    if (x == temp % (int)Math.pow(10, i)) {
                        System.out.println("Automorphic number"); 
                        isNoAuto = false;
                    }
                    b = (x < temp % (int)Math.pow(10, i)) ? 1 : 0;
                }
                if(isNoAuto) { System.out.println("Non-Automorphic number"); }
                break;
            default: 
                System.out.println("Invalid input");
        }
    }
}