import java.util.Random;

public class matriz4 {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        Random random = new Random();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j<matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(9);
            }
        }

        for ( int[] row : matrix ) {
            for ( int col : row ) {
                System.out.print(col + " ");
            }

            System.out.println();
        }
    }
}