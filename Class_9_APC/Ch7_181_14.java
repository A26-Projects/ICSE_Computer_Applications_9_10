import java.util.Scanner;
public class Ch7_181_14 {
    public static void main(String[] argus) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = sc.nextLine();
        System.out.print("Please enter the basic salary: ");
        double bs = sc.nextDouble();
        double da, sa, gs;
        if (bs <= 10000) {
            da = 10; sa = 5;
        } else if (bs <= 20000) {
            da = 12; sa = 8;
        } else if (bs <= 30000) {
            da = 15; sa = 10;
        } else {
            da = 20; sa = 12;
        }
        da = (bs * da)/100;
        sa = (bs * sa)/100;
        gs = bs + da + sa;
        System.out.println("Name\t\tBasic\t\tDA\t\tSA\t\tGross Salary");
        System.out.println(name + "\t\t" + bs + "\t\t" + da + "\t\t" + sa + "\t\t" + gs);
    }
}
