import java.util.Scanner;
public class P386_7_Library {
    private String name;
    private int price, day;
    private double fine;

    public static void main(String[] argus) {
        P386_7_Library p = new P386_7_Library();
        p.input();
        p.cal();
        p.display();
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the name of the book: ");
        name = sc.nextLine();
        System.out.print("Please enter the printed price of the book: ");
        price = sc.nextInt();
        System.out.print("Please enter the number of days for the fine to be paid: ");
        day = sc.nextInt();
    }

    public void cal() {
        if (day <= 7)
            fine = 0.2 * day;
        else if (day <= 15)
            fine = 0.2 * 7 + (day - 7) * 0.4;
        else if (day <= 30)
            fine = 0.2 * 7 + 0.4 * 8 + 0.6 * (day - 15);
        else
            fine = 0.2 * 7 + 0.4 * 8 + 0.6 * 15 + (day - 30) * 0.8;
    }

    public void display() {
        System.out.println();
        System.out.println("Name of the book: " + name);
        System.out.println("Printed Price of the book: Rs. " + price);
        System.out.println("Fine to be paid: Rs. " + fine);
    }
}
