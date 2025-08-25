public class P340_18 {
    public void calculate(int m, char ch) {
        if (ch == 's') System.out.println(m + " is " + (m % 7 == 0 ? "" : "not ") + "divisible by 7");
        else System.out.println("The last digit of " + m + " is " + (m % 10 == 7 ? "" : "not ") + "7");
    }

    public void calculate(int a, int b, char ch) {
        if (ch == 'g') System.out.println("The greater integer is: " + Math.max(a, b));
        else System.out.println("The smaller integer is: " + Math.min(a, b));
    }
}
