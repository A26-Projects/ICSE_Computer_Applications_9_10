public class Ch4_94_6 {
    public static void main(String[] args) {
        //declaring and initialising the variables for all the ratio terms and angle values
        int term_1 = 3, term_2 = 4, term_3 = 5, term_4 = 6;
        int x, angle_1, angle_2, angle_3, angle_4;
        //calculaitng the value of x which is the constant of proportionality
        x = 360/(term_1 + term_2 + term_3 + term_4);
        //calculating the value of all the angles using x
        angle_1 = term_1 * x;
        angle_2 = term_2 * x;
        angle_3 = term_3 * x;
        angle_4 = term_4 * x;
        //printing the results(values of all angles)
        System.out.println("The first angle is " + angle_1);
        System.out.println("The second angle is " + angle_2);
        System.out.println("The third angle is " + angle_3);
        System.out.println("The fourth angle is " + angle_4);
    }
}