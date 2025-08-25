import java.util.Scanner;
public class Ch7_181_17 {
    public static void main(String[] argus) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the floor number");
        System.out.println("1) Ground Floor");
        System.out.println("2) First Floor");
        System.out.println("3) Second Floor");
        System.out.println("4) Third Floor");
        int a = sc.nextInt();
        switch(a) {
            case 1:
                System.out.println("Kid's wear");
                break;
            case 2:
                System.out.println("Ladies wear");
                break;
            case 3:
                System.out.println("Designer Sarees");
                break;
            case 4:
                System.out.println("Men's wear");
                break;
            default:
                System.out.println("Invalid input");
                System.exit(0);
        }
        System.out.print("Please enter the item purchased: ");
        sc.nextLine();
        String item = sc.nextLine();
        System.out.print("Please enter the price of the item: ");
        double price = sc.nextDouble();
        System.out.println("Name of the Shop: City Mart");
        System.out.println("Item purchased: " + item);
        System.out.println("Final Amount: Rs. " + price);
        System.out.println("Visit Again!!!");
    }
}
