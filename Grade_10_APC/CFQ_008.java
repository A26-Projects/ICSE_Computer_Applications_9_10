import java.util.Scanner;
public class CFQ_008 {
	public static void main(String[] argus) {
		Scanner sc = new Scanner(System.in);
		int[] marks = new int[100];
		for(int i = 1; i <= marks.length; i++) {
			System.out.print("Please enter the marks of student number " + i + " out of 100: ");
			marks[i - 1] = sc.nextInt();
		}

		int r1 = 0, r2 = 0, r3 = 0, r4 = 0;
		for(int x : marks) {
			if(x > 90) r1++;
			else if (x >= 80) r2++;
			else if (x >= 60) r3++;
			else r4++;
		}
		
		System.out.println("Range\t\tNo. of students");
		System.out.println("Above 90\t" + r1);
		System.out.println("80 to 90\t" + r2);
		System.out.println("60 to 80\t" + r3);
		System.out.println("Below 60\t" + r4);
	}
}
