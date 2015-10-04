/**
 * Created by Mao Shaco on 10/4/2015.
 */
public class Main {
    public static void main(String[] args) {
        int size = 20;
        int a[][] = new int[size][size];
        fullFillMatrix(a);
        showMatix(a);
    }

    private static void showMatix(int[][] matrix) {
        for (int[] x : matrix) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }

    private static void fullFillMatrix(int[][] matrix) {
        for (int i = 0, j = matrix.length; i < matrix.length; i++, j--) {

            //matrix[i][i] = 1;
            //matrix[i][matrix.length - i - 1] = 1;

            matrix[i][i]++;
            matrix[i][matrix.length - i - 1]++;
            if (i == matrix.length - i - 1)
                matrix[i][i]--;
        }
    }
}
