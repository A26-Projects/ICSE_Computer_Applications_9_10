import java.sql.SQLOutput;

public class Pattern_Equi_Triangle_2 {
    public static void main(String[] argus) {
        for(int i = 1; i <= 5; i++) {
            for(int j = i; j <= 5; j++) {
                System.out.print("@@@");
            }
            for(int k = 1; k <= i; k++) {
                System.out.print("AXA   ");
            }
            System.out.println();
        }
    }
}
