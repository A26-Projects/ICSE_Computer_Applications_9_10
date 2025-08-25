public class Ch9_263_1 {
    public static void main(String[] argus) {
        for(int i = 5; i <= 10; i++) {
            System.out.println("Multiplication table of " + i);
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " times " + j + " = " + i*j);
            }
        }
    }
}