import java.util.Scanner;
public class P387_9_Honda {
    private int type, cost;
    private double newCost;

    public static void main(String[] argus) {
        P387_9_Honda p = new P387_9_Honda();
        p.gettype();
        p.find();
        p.printcost();
    }

    public void gettype() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the type of engine: ");
        type = sc.nextInt();
        System.out.print("Please enter the previous cost: ");
        cost = sc.nextInt();
    }

    public void find() {
        if (type == 2)
            newCost = cost + (cost * 10.0)/100;
        else if (type == 4)
            newCost = cost + (cost * 12.0)/100;
    }

    public void printcost() {
        System.out.println("Type of engine: " + type + " stroke");
        System.out.println("New cost: Rs. " + newCost);
    }
}
