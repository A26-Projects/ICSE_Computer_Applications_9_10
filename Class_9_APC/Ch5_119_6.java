public class Ch5_119_6 {
    public static void main(String[] args) {
        //declaring and initialising the variables with the given values
        float nominal_val = 10, annual_div = 2000, div_percent = 10, shares;
        //calculating the current number of shares using the formula
        shares = (annual_div*100)/(nominal_val*div_percent);
        //finding the number of requeired shares
        shares = 3000 - shares;
        //printing the final result
        System.out.println("The number of shares requires to accumulate 3000 shares is " + (int)(shares) + " shares");
    }
}