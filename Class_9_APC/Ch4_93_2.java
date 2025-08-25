public class Ch4_93_2 {
    public static void main(String[] args) {
        //declaring the variables and initialising them with the provided values
        int present_fees = 350, absent_fees = -30, present = 25, absent = 5, salary;
        //calculating total salary
        salary = (present_fees*present) + (absent_fees*absent);
        //printing the final salary
        System.out.println("The monthly income is: " + salary);
    }
}