import java.util.Scanner;
public class P389_16_ParkingLot {
    private int vno, hours;
    private double bill;

    public static void main(String[] argus) {
        P389_16_ParkingLot p = new P389_16_ParkingLot();
        p.input();
        p.calculate();
        p.display();
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the vehicle number: ");
        vno = sc.nextInt();
        System.out.print("Please enter the number of hours the vehicle is parked for: ");
        hours = sc.nextInt();
    }

    public void calculate() {
        if (hours == 1)
            bill = 3;
        else if (hours > 1)
            bill = 3 + (hours - 1) * 1.5;
    }

    public void display() {
        System.out.println();
        System.out.println("Vehicle Number: " + vno);
        System.out.println("Hours parked: " + hours);
        System.out.println("Final bill: Rs. " + bill);
    }
}
