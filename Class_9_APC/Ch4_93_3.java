public class Ch4_93_3 {
    public static void main(String[] args) {
        //declaring and initialising the variables
        float questions = 150, cand_1_percentage = 80, cand_2_percentage = 72, cand_1, cand_2;
        //calculating the correct answers of both the candidates
        cand_1 = (cand_1_percentage/100)* questions;
        cand_2 = (cand_2_percentage/100)* questions;
        //printing the results
        System.out.println("First candidate got " + cand_1 + " correct answers out of " + questions);
        System.out.println("Second candidate got " + cand_2 + " correct answers out of " + questions);
    }
}