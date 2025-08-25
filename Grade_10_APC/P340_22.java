public class P340_22 {
    public static void main(String[] argus) {
        P340_22 p = new P340_22();
        p.display("comic", 'c');
        p.display("hello", 'h');
        p.display("good", "good");
        p.display("good", "dawn");
        p.display("temporal", 6);
    }

    public void display(String str, char ch) {
        if (str.charAt(0) == ch && str.charAt(str.length() - 1) == ch)
            System.out.println("Special Word");
        else
            System.out.println("No special word");
    }

    public void display(String str1, String str2) {
        System.out.println("The strings are " + (str1.equals(str2) ? "" : "not ") + "equal");
    }

    public void display(String str, int n) {
        System.out.println("The character at position " + n + " is: " + str.charAt(n - 1));
    }
}
