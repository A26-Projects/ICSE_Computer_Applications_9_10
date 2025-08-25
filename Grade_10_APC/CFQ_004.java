import java.util.Scanner;
public class CFQ_004 {
	public static void main(String[] argus) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the index number: ");
		String index = sc.nextLine();
		String grade, year, centre, rno;
		grade = index.substring(0, 1);
		if(grade.equals("1"))
			grade = "10";
		else if(grade.equals("2"))
			grade = "12";
		year = index.substring(1, 3);
		centre = index.substring(3, 7);
		rno = index.substring(8);
		System.out.println("Class: " + grade);
		System.out.println("Year: " + year);
		System.out.println("Centre number: " + centre);
		System.out.println("Index number: " + rno);
	}
}
