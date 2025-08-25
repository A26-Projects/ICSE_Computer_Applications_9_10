
import java.util.Scanner;
public class Ch9_265_13 {
    public static void main(String[] argus) {
        Scanner sc = new Scanner(System.in);
        int marks = 0, num = 0;
        for(int i = 1; i <= 4; i++) {
            System.out.println("Please enter the marks of students of section " + i);
            for(int j = 1; j <= 40; j++) {
                System.out.print("Please enter the percentage marks of student " + j + ": ");
                marks = sc.nextInt();
                if (marks > 95) { num++; }
            }
            System.out.println(num + " student(s) scored more than 95% in section " + i);
            System.out.print("\n");
        }
    }
}
