public class Ch4_93_4 {
    public static void main(String[] args) {
        //declaring and initialising the variables with the given values
        float a = 80, b = 90, x = 7.5f, y = 7.2f, result_1, result_2;
        //calculating the first percentage difference using the formula
        result_1 = ((Math.abs(a - b))/((a + b)/2)) * 100;
        //printing the result
        System.out.println("The percentage difference between " + x + " and " + y + " is " + result_1 + "%");
        //calculating the second percentage difference using the formula
        result_2 = ((Math.abs(x - y))/((x + y)/2)) * 100;
        //printing the result
        System.out.println("The percentage difference between " + x + " and " + y + " is " + result_2 + "%");
    }
}