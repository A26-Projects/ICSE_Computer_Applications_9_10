public class P146_9 {
    public static void main(String[] argus) {
        //(b) part
        System.out.println("--- (b) part ---");
        int x = 1;
        for(int i = 5; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print(x + " " + (x > 9 ? "" : " "));
                x++;
            }
            System.out.println();
        }
        System.out.println();
        //(d) part
        System.out.println("--- (d) part ---");
        for( int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j % 2 + " ");
            }
            System.out.println();
        }
        System.out.println();
        //(f) part
        System.out.println("--- (f) part ---");
        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j < i; j++) {
                System.out.print(i + " ");
            }
            for(int k = i; k <= 5; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
        System.out.println();
        //(i) part
        System.out.println("--- (i) part ---");
        x = 1;
        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(x + " " + (x > 9 ? "" : " "));
                x++;
            }
            System.out.println();
        }
    }
}
