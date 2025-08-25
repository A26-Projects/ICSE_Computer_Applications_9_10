import java.util.Scanner;
public class P265_11 {
    public static void main(String[] argus) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a word: ");
        String str = sc.next().toLowerCase();
        boolean isPalindrome = true;
        for (int i = 0; i <= str.length()/2; i++) {
            if(str.charAt(i) != str.charAt(str.length() - (1 + i))) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("\"" + str + "\'" + " is " + (isPalindrome ? "" : "not ") + "a Palindrome");
    }
}
