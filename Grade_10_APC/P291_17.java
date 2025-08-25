import java.util.Scanner;
public class P291_17 {
    public static void main(String[] argus) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a sentence: ");
        String str = sc.nextLine().toUpperCase();
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1))
                count++;
        }
        System.out.println(count);
    }
}
