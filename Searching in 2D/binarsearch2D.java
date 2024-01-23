import java.util.Arrays;

public class binarsearch2D {
    public static void main(String[] args) {
        int[][] mat = { { 12, 23, 45, 65 }, { 22, 24, 48, 77 }, { 31, 35, 55, 79 }, { 37, 41, 66, 85 } };
        int target = 12;
        int[] result = search(mat, target);
        System.out.println(Arrays.toString(result));

    }

    static int[] search(int[][] matrix, int target) {
        int[] ans = { -1, -1 };
        int row = 0;
        int col = matrix[0].length -1;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                ans[0] = row;
                ans[1] = col;
                return ans;
            }
            if (target > matrix[row][col]) {
                row++;
            } else if (target < matrix[row][col]) {
                col--;
            }
        }

        return ans;
    }
}
