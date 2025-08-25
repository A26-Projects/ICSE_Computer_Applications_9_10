import java.util.Scanner;
public class Ch9_264_7 {
    public static void main(String[] argus) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of students");
        int num = sc.nextInt();
        double total = 0.0d;
        for(int i = 1; i <= num; i++) {
            System.out.println("Please enter the name of student " + i + ": ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Marks in English: ");
            total += sc.nextDouble();
            System.out.print("Marks in Science: ");
            total += sc.nextDouble();
            System.out.print("Marks in Mathematics: ");
            total += sc.nextDouble();
            System.out.println("The average marks of " + name + " are: " + total/3);
            total = 0.0d;
        }
    }
}