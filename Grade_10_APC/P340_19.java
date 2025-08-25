public class P340_19 {
    public void compare(int a, int b) {
        System.out.println("Greater Integer: " + Math.max(a, b));
    }

    public void compare(char a, char b) {
        System.out.println("Greater Numeric Value: " + (char)Math.max(a, b));
    }

    public void compare(String a, String b) {
        System.out.println("String with greater length: " + (a.length() > b.length() ? a : b));
    }
}
