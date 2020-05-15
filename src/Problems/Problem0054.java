package Problems;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a matrix of m x n elements (m rows, n columns),
 * return all elements of the matrix in spiral order.
 */
public class Problem0054 {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        if (matrix.length == 0) return list;
        int Rend = matrix.length - 1;
        int Cend = matrix[0].length - 1;
        int Rstart = 0;
        int Cstart = 0;
        while (Rstart <= Rend && Cstart <= Cend) {
            for (int col = Cstart; col <= Cend; col++) list.add(matrix[Rstart][col]);
            for (int row = Rstart + 1; row <= Rend; row++) list.add(matrix[row][Cend]);
            if (Rstart < Rend && Cstart < Cend) {
                for (int col = Cend - 1; col >= Cstart; col--) list.add(matrix[Rend][col]);
                for (int row = Rend - 1; row > Rstart; row--) list.add(matrix[row][Cstart]);
            }
            Rend--;
            Rstart++;
            Cend--;
            Cstart++;
        }
        return list;
    }

}
