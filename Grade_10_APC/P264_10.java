import java.util.Scanner;
public class P264_10 {
    public static void main(String[] argus) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a word: ");
        String str = sc.next().toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    str = str.substring(0, j) + str.substring(j + 1);
                }
            }
        }
            System.out.println(str);
        }
    }