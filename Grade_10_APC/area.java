public class area {
    double area (double r, double h){
        double l, a;
        l = Math.sqrt(r*r + h*h);
        a = 22.0/7*r*l;
        return a;
    }

    public static void main(String[] argus) {
        //area a = new area();
        //System.out.println(a.area(12, 13.6));

        int p = 0;
        for (p = 4; p > 0; p -= 2);
        System.out.print(p);
        System.out.println(p);

        double a = 1, b = 4, sum = 0;
        for(double d = a; d <= b; d += 0.5)
            sum += d;
        System.out.println(sum);


    }
}
