import java.util.Arrays;

public class perfectbinarysearch2D {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        int target = 16;
        System.out.println(Arrays.toString(search(matrix, target)));

    }

    static int[] binarysearch(int[][] matrix, int row, int cstart, int cend, int target) {
        while (cstart <= cend) {
            int mid = cstart + (cend - cstart) / 2;
            if (matrix[row][mid] == target) {
                return new int[] { row, mid };
            }
            if (matrix[row][mid] > target) {
                mid = cend - 1;
            } else if (matrix[row][mid] < target) {
                mid = cstart + 1;
            }
        }
        return new int[] { -1, -1 };
    }

    static int[] search(int[][] matrix, int target) {
        int row = matrix.length;
        int cols = matrix[0].length / 2;
        int colsend = matrix[0].length - 1;

        int rstart = 0;
        int rend = row - 1;

        while (rstart < (rend - 1)) {
            int mid = rstart + (rend - rstart) / 2;
            if (matrix[mid][cols] == target) {
                return new int[] { mid, cols };
            }
            if (matrix[mid][cols] > target) {
                rend = mid - 1;
            } else if (matrix[mid][cols] < target) {
                rstart = mid;
            }
        }

        if (matrix[rstart][cols] == target) {
                return new int[] { rstart, cols };
        }
        if (matrix[rstart+1][cols] == target) {
                return new int[] { rstart+1, cols };
            }


        if (target <= matrix[rstart][cols]) {
            return binarysearch(matrix, rstart, 0, cols - 1, target);
        }
        if (target >= matrix[rstart][cols] && target <= matrix[rstart][colsend]) {
            return binarysearch(matrix, rstart, cols + 1, colsend, target);
        }
        if (target <= matrix[rstart+1][cols]) {
            return binarysearch(matrix, rstart+1, 0, cols - 1, target);
        }
        else if (target >= matrix[rstart+1][cols] && target <= matrix[rstart+1][colsend]) {
            return binarysearch(matrix, rstart+1, cols + 1, colsend, target);
        }

        return new int[] { -1, -1 };
    }
}
