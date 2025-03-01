import java.util.Arrays;

public class Triangular {
    public static int[][] lowerTriangular(int size) {
      int[][] matrix = new int[size][];

      for (int i = 0; i < size; i++) {
        matrix[i] = new int[i+1];
      }

      return matrix;
    }

    public static int[][] sequenceInMatrix(int[][] matrix) {
        int count = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < i + 1; j++) {
                matrix[i][j] = ++count;
            }
        }
        return matrix;
    }
}
