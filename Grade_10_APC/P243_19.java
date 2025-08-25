public class P243_19 {
    public static void main(String[] argus) {
        int[][] M = {{-1, 0, 2}, {-3, -1, 6}, {4, 3, -1}};
        int[][] MsumN = {{-6, 9, 4}, {4, 5, 0}, {1, -2, -3}};
        int[][] N = new int[3][3];
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[0].length; j++) {
                N[i][j] = MsumN[i][j] - M[i][j];
            }
        }
        
        System.out.println("The elements of N are: ");
        for(int[] x : N) {
            for(int y : x)
                System.out.print(y + " ");
            System.out.println();
        }
                
    }
}