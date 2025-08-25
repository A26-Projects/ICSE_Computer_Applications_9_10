import java.util.Scanner;
public class P389_17_RailwayTicket {
    private String name, coach;
    private int amt, totalamt;
    private long mobno;

    public static void main (String[] argus) {
        P389_17_RailwayTicket p = new P389_17_RailwayTicket();
        p.accept();
        p.update();
        p.display();
    }

    public void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the name of the customer: ");
        name = sc.nextLine();
        System.out.print("Please enter the mobile number of the customer: ");
        mobno = sc.nextLong();
        sc.nextLine();
        System.out.print("Please enter the type of coach: ");
        coach = sc.nextLine();
        System.out.print("Please enter the initial amount: ");
        amt = sc.nextInt();
    }

    public void update() {
        switch (coach) {
            case "First_AC": totalamt = amt + 700; break;
            case "Second_AC": totalamt = amt + 500; break;
            case "Third_AC": totalamt = amt + 250; break;
            case "Sleeper": totalamt = amt;
        }
    }

    public void display() {
        System.out.println();
        System.out.println("Name of the customer: " + name);
        System.out.println("Coach: " + coach);
        System.out.println("Mobile Number of the customer: " + mobno);
        System.out.println("Total amount to be paid: Rs. " + totalamt);
    }
}
