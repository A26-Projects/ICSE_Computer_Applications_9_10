import java.util.Scanner;
public class P266_12 {
    public static void main(String[] argus) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a word: ");
        String str = sc.next().toUpperCase();
        String v = "AEIOU";
        int index = str.length();
        for (char i = 0; i < v.length(); i++) {
            int vowel = str.indexOf(v.charAt(i));
            if (vowel < index && vowel >= 0) {
                index = vowel;
            }
        }
        String pigLatin = str.substring(index) + str.substring(0, index) + "AY";
        System.out.println(pigLatin);
    }
}
