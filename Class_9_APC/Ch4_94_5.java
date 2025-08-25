public class Ch4_94_5 {
    public static void main(String[] args) {
        //declaring and initailising the variables
        float temp_faren = 98.6f, temp_cel;
        //calculating the celsius value using the formula
        temp_cel = ((temp_faren - 32)*5/9);
        //printing the result
        System.out.println("The Celsius value of 98.6F is " + temp_cel);
    }
}