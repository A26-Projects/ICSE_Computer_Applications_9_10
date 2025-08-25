public class Ch4_93_1 {
    public static void main(String[] args) {
        //declaring all the variables
        float a, b, c, x, temp;
        //assigning the value 5 to "x"
        x = 5;
        //assigning the first expression to "temp"
        temp = ((x + 3)/6) - ((2*x + 5)/3);
        //printing result of first expression
        System.out.println("When x is equal to 5, the value of the first expression is " + temp);
        
        //initialising "a", "b" and "c"
        a = 5;
        b = 4;
        c = 3;
        //assigning the second expression to "temp"
        temp = (a*a + b*b + c*c)/((a*b)*c);
        //printing the result of the second expression
        System.out.println("When a, b and c are 5, 4 and 3 respectively, the value of the second expression is " + temp);
        
    }
}