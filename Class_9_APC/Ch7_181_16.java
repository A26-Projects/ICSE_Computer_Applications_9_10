import java.util.Scanner;
public class Ch7_181_16 {
    public static void main(String[] argus) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 1 to display the volume of a cuboid");
        System.out.println("Please enter 2 to display the volume of a cylinder");
        System.out.println("Please enter 3 to display the volume of a cone");
        int a = sc.nextInt();
        double vol, pi = 22.0d/7, consta = 1.0d/3;
        switch(a) {
            case 1:
                System.out.println("Please enter the length, breadth and height of the cuboid respectively");
                int l = sc.nextInt();
                int b = sc.nextInt();
                int h = sc.nextInt();
                vol = l * b * h;
                System.out.println("The volume of the cuboid is: " + vol + " cubic units");
                break;
            case 2:
                System.out.println("Pleas enter the radius and height of the cylinder respectively");
                int r = sc.nextInt();
                h = sc.nextInt();
                vol = pi * r * r * h;
                System.out.println("The volume of the cylinder is: " + vol + " cubic units");
                break;
            case 3:
                System.out.println("Pleas enter the radius and height of the cone respectively");
                r = sc.nextInt();
                h = sc.nextInt();
                vol = consta * pi * r * r * h;
                System.out.println("The volume of the cone is: " + vol + " cubic units");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }
}
