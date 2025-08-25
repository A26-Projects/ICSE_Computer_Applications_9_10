public class Ch8_230_1 {
    public static void main(String[] argus) {
        //using a for loop to print the squares of the first 10 natural numbers
        for (int i = 1; i <= 10; i++) {
            System.out.print(i*i + " ");
        }
        //moving cursor to next line
        System.out.print("\n");
        //declaring and initialising a temporary variable
        int temp = 1;
        //creating a for loop to print a series in which the difference between terms are natural numbers
        for(int i = 1; i <= 10; i++) {
           System.out.print(temp + " ");
           temp += i;
        }
        System.out.print("\n");
        //creating a for loop for printing the first 10 multiples of three
        for (int i = 1; i <= 10; i++) {
            System.out.print(3*i + " ");
        }
        System.out.print("\n");
        //creating a for loop for printing the first 10 multiples of four
        for (int i = 1; i <= 10; i++) {
            System.out.print(4*i + " ");
        }
        System.out.print("\n");
        //creating a for loop for printing the first 10 multiples of 1.5
        for (int i = 1; i <= 10; i++) {
            System.out.print(1.5f*i + " ");
        }
        System.out.print("\n");
        //creating a for loop for printing one less than the cubes of the first ten natural numbers
        for (int i = 1; i <= 10; i++) {
            System.out.print(i*i*i - 1 + " ");
        }
        System.out.print("\n");
        //creating a for loop for printing the squares of the first 10 odd numbers
        for (int i = 1; i <= 10; i++) {
            System.out.print((2*i-1)*(2*i-1) + " ");
        }
        System.out.print("\n");
        //creating a for loop for printing the squares of the first 10 even numbers
        for (int i = 1; i <= 10; i++) {
            System.out.print(2*i*2*i + " ");
        }
        System.out.print("\n");
        //reinitailising temporary variable
        temp = 0;
        //creating a for loop to print a series in which the difference between terms are
        //natural odd numbers, starting from 0, excluding the first odd number
        for (int i = 1; i <= 10; i++) {
            System.out.print(temp + " ");
            temp += 2*i + 1;
        }
        System.out.print("\n");
        //creating a for loop for printing the one less than the squares of the first 10 multiples of 5
        for (int i = 1; i <= 10; i++) {
            System.out.print((5*i*5*i) - 1 + " ");
        }
        System.out.print("\n");
        //reinitialising the temporary variable
        temp = 1;
        //creating a for loop to print a series in which the difference between terms are
        //natural odd numbers, starting from 1, including the first odd number
        for (int i = 1; i <= 10; i++) {
            temp += 2*i - 1;
            System.out.print(temp + " ");
        }
    }
}