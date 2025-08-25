//polymorphism --> method overloading
public class CFQ_007 {
	public double area(double b, double h) { return 0.5 * b * h; }
	public double area(double s) { return Math.pow(s, 2); }
	public double area(double a, double b, double h) { return 0.5 * (a + b) * h; }
	public double area(int l, int b) { return l * b; }
	public static void main(String[] argus) {
		CFQ_007 c = new CFQ_007();
		System.out.println(c.area(3, 4));
		System.out.println(c.area(4.5));
		System.out.println(c.area(1, 2, 3.6));
		System.out.println(c.area(5.4, 2.2));
	}
}
