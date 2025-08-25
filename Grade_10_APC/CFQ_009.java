import java.util.Scanner;
public class CFQ_009 {
	public static void main(String[] argus) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the password: ");
		String s = sc.next();
		int uppers = 0, lowers = 0, specials = 0, digits = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (Character.isUpperCase(ch)) uppers++;
			else if (Character.isLowerCase(ch)) lowers++;
			else if (Character.isDigit(ch)) digits++;
			else if(!Character.isLetterOrDigit(ch)) specials++;
		}
		
		if(s.length() >= 12 && uppers >=4 && lowers >= 4 && specials >= 2 && digits >= 2)
			System.out.println("\"" + s + "\" is a strong password");
		else
			System.out.println("\"" + s + "\" is not a strong password");
		sc.close();
	}
}
