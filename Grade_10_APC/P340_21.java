public class P340_21 {
    public static void main(String[] argus){
        P340_21 p = new P340_21();
        p.display(32);
        p.display(16);
        p.display("Hello", 'c');
        p.display("Hello", 'e');
        p.display("Hello12^");
        p.display("Hello#@&#^");
    }
    public void display(int num) {
        System.out.println(num + " is " + (Math.sqrt(num) == (int)Math.sqrt(num) ? "" : "not ") + "a perfect square");
    }

    public void display(String str, char ch) {
        System.out.println("\"" + str + "\" " + (str.indexOf(ch) == -1 ? "does not contain" : "contains") + " the character \'" + ch + "\'");
    }

    public void display(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isLetterOrDigit(str.charAt(i))) count++;
        }
        System.out.println("Number of special characters in " + "\"" + str + "\"" + " is: " + count);
    }
}
