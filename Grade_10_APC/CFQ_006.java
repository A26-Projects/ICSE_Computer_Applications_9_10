public class CFQ_006 {
	public static void main(String[] argus) {
		CFQ_006 c = new CFQ_006();
		c.perform(new int[]{4, 5, 16, 6, 12, 9});
		c.perform("CARPENTER", 'F');
		c.perform(45376);
	}

	public void perform(int[] x) {
		int largest = x[0];
		for(int n : x) {
			if(n > largest)
				largest = n;
		}
		System.out.println("Largest: " + largest);
	}

	public void perform(String s, char ch) {
		if (ch == 'F')
			System.out.println(s.substring(0, 5));
		else if (ch == 'L')
			System.out.println(s.substring(s.length() - 5));
	}

	public void perform(int n) { 
		int first = n % 10;
		int last = Integer.parseInt(String.valueOf(n).substring(0, 1));
		System.out.println(first + " X " + last + " = " + (first * last));

		int d, p=1;
		while(n>0)
		{ d=n%10; p= p*d;
			n=n/10;}
		System.out.println((p));
	}
}
