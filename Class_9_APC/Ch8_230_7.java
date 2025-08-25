import java.util.Scanner;
public class Ch8_230_7 {
    public static void main(String[] argus) {
        Scanner sc = new Scanner(System.in);
        int first = 0, second = 0;
        System.out.println("Please enter the marks in English, Science, Mathematics out of 100 respectively");
        for (int i = 1; i <= 40; i++) {
            System.out.println("Enter the marks for student " + i);
            float eng = sc.nextFloat();
            float sci = sc.nextFloat();
            float math = sc.nextFloat();
            if ((eng + math + sci) / 3 >= 95) { first++; }
            if (eng >= 90 && math >= 90 && sci >= 90) { second++; }
        }
        System.out.println(first + " students have scored 95% or more aggregate");
        System.out.println(second + " students have scored 90% or more in english, science, and maths");
        
    }
}