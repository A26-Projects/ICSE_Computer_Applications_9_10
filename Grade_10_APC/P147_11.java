import java.util.Scanner;
public class P147_11 {
    public static void main(String[] argus) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter \'a\' to print Floyd's Triangle upto 5 rows and \'b\' to print a pattern using the word \"ICSE\"'");
        System.out.print("Please enter your choice: ");
        char a = sc.next().charAt(0);
        switch (a) {
            case 'a':
                int x = 1;
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j <= i; j++) {
                        System.out.print(x + (x > 9 ? " " : "  "));
                        x++;
                    }
                    System.out.println();
                }
                break;
            case 'b':
                String str = "ICSE";
                for(int i = 0; i < str.length(); i++) {
                    for (int j = 0; j <= i; j++) {
                        System.out.print(str.charAt(j) + " ");
                    }
                    System.out.println();
                }
                break;
            default:
                System.out.println("Invalid Choice!");
        }
    }
}