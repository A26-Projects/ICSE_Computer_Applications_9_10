public class P327_11 {
    public static void main(String[] argus) {
        P327_11 p = new P327_11();
        System.out.println("Area of Scalene Triangle: " + p.area(4.1, 3.5, 7.2));
        System.out.println("Area of Trapezium: " + p.area(5, 6, 3));
        System.out.println("Area of Rhombus: " + p.area(5.4, 9.6));
    }

    public double area(double a, double b, double c) {
        double s = (a + b + c)/2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public double area(int a, int b, int height) {
        return 1.0/2 * (a + b) * height;
    }

    public double area(double diagonal1, double diagonal2) {
        return 1.0/2 * diagonal1 * diagonal2;
    }
}
