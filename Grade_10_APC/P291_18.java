import java.util.Scanner;
public class P291_18 {
    public static void main(String[] argus) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a word: ");
        String word = sc.next().toUpperCase();
        boolean special = true, pal = true;
        for (int i = 0; i <= word.length()/2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - (i + 1))) {
                if (i == 0) special = false;
                pal = false;
            }
        }
        if (special) {
            if (pal)
                System.out.println("It is a Palindrome and a Special Word");
            else
                System.out.println("It is a Special Word, but not a Palindrome");
        } else
            System.out.println("It is neither a Palindrome nor a Special Word");
    }
}
