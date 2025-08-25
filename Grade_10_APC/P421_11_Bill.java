public class P421_11_Bill {
    private String name;
    private int bno, call;
    private double amt;

    public static void main(String[] argus) {
        P421_11_Bill p = new P421_11_Bill("Shubham", 13459, 260);
        p.Calculate();
        p.Display();
    }

    public P421_11_Bill() {
        name = "";
        bno = 0; call = 0;
        amt = 0.0;
    }

    public P421_11_Bill(String n, int b, int c) {
        name = n;
        bno = b;
        call = c;
        amt = 0.0;
    }

    public void Calculate() {
        if (call <= 100)
            amt = 0.6 * call;
        else if (call <= 200)
            amt = 0.6 * 100 + 0.8 * (call - 100);
        else if (call <= 300)
            amt = 100 * (0.6 + 0.8) + 1.2 * (call - 200);
        else
            amt = 100 * (0.6 + 0.8 + 1.2) + 1.5 * (call - 300);
        amt += 125;
    }

    public void Display() {
        System.out.println("Name: " + name);
        System.out.println("Bill Number: " + bno);
        System.out.println("Number of calls made: " + call);
        System.out.println("Total amount to be paid: Rs. " + amt);
    }
}
