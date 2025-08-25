import java.util.Scanner;
public class P389_15_Student {
    private String name;
    private int eng, hn, mts;
    private double total, avg;

    public static void main(String[] argus) {
        P389_15_Student p = new P389_15_Student();
        p.accept();
        p.compute();
        p.display();
    }

    public void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the student's name: ");
        name = sc.nextLine();
        System.out.print("Please enter the English Marks: ");
        eng = sc.nextInt();
        System.out.print("Please enter the Hindi Marks: ");
        hn = sc.nextInt();
        System.out.print("Please enter the Mathematics Marks: ");
        mts = sc.nextInt();
    }

    public void compute() {total = eng + hn + mts; avg = total/3;}

    public void display() {
        System.out.println("Name of the student: " + name);
        System.out.println("English Marks: " + eng);
        System.out.println("Hindi Marks: " + hn);
        System.out.println("Mathematics Marks: " + mts);
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + avg);
    }
}
