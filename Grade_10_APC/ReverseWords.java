import java.util.Scanner;
public class ReverseWords {
    public static void main(String[] argus) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a sentence: ");
        String str = sc.nextLine() + " ";
        String revStr = "", revWord = "", temp = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isWhitespace(ch)) {
                while(!temp.isEmpty()) {
                    revWord += temp.substring(temp.length() - 1);
                    temp = temp.substring(0, temp.length() - 1);
                }
                revStr += revWord + " ";
                revWord = "";
                temp = revWord;
                continue;
            }
            temp += ch;
        }

        System.out.println(revStr);
    }
}
