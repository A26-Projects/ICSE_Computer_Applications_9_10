import java.util.Scanner;
public class Reverse_Words {
    public static void main(String[] argus) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a sentence: ");
        String str = " " + sc.nextLine();
        int currentSpace;

        while (str.lastIndexOf(' ') != -1) {
            currentSpace = str.lastIndexOf(' ');
            System.out.print(str.substring(currentSpace + 1) + " ");
            str = str.substring(0, currentSpace);
        }
    }
}
