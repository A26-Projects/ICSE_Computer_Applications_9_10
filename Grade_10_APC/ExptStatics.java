public class ExptStatics {

    public static void main(String[] argus) {
        Testing t = new Testing();
        System.out.println(Testing.genome);
        Testing.editGenome(20);
        System.out.println(t.genome);
        System.out.println(Testing.genome);
        t.a();

        Integer num = 100;
        System.out.println(num.getClass().getSimpleName());

        String s = "Hello", rev = "";
        for(int i = s.length() - 1; i >= 0; i--) rev += s.charAt(i);
        System.out.println(rev);

        String s1 = "Hi!";
        String s2 = "Hi!";

        System.out.println(s1.equals(s2));
    }
}

class Testing {
    static int genome = 100;

    public static void editGenome(int n) {
        genome = n;
    }

    public static int b() {
        return 15;
    }

    public void a () {
        int temp = b();
        System.out.println((false + "").length());
        System.out.println(Character.toString('\n'));
        System.out.println(Double.toString(34.34).length());
        System.out.println(String.valueOf(34.34).length());
    }
}