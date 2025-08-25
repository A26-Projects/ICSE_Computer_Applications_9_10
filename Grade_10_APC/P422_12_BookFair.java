import java.util.Scanner;

public class P422_12_BookFair {

    private String BName;
    private double price;

    public static void main(String[] argus) {
        P422_12_BookFair p = new P422_12_BookFair();
        p.input();
        p.calculate();
        p.display();
    }

    public P422_12_BookFair() {
        BName = "";
        price = 0.0;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the name of the book and its price respectively");
        BName = sc.nextLine();
        price = sc.nextDouble();
    }

    public void calculate() {
        double dis = 0;
        if (price <= 1000)
            dis = 2;
        else if (price <= 3000)
            dis = 10;
        else
            dis = 15;
        price -= (price * dis)/100;
    }

    public void display() {
        System.out.println("Name of the book: " + BName);
        System.out.println("Price after discount: Rs." + price);
    }
}
