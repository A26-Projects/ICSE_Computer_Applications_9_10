import java.util.Scanner;
public class P291_19 {
    public static void main(String[] argus) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a sentence: ");
        String str = sc.nextLine().toUpperCase();
        int prev = 0, next = str.indexOf(' '), count = 0;
        for(int i = 0; i < str.length() - 1; i++) {
            if (i == next) {
                prev = next;
                next = str.indexOf(' ', prev + 1);
                if (next == -1)
                    next = str.length();
            }
            if (str.charAt(i) + 1 == (int)str.charAt(i + 1)) {
                System.out.println(str.substring(prev + (prev == 0 ? 0 : 1), next));
                count++;
            }
        }
        System.out.println("Number of words containing consecutive letters: " + count);
    }
}
