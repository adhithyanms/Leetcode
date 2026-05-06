class Solution {

    public void findZero(int row, int col, int[][] matrix) {

        int rowsize = matrix.length;
        int colsize = matrix[0].length;

        // Mark entire row
        for (int i = 0; i < colsize; i++) {
            if (matrix[row][i] != 0) {
                matrix[row][i] = 9939;
            }
        }

        // Mark entire column
        for (int j = 0; j < rowsize; j++) {
            if (matrix[j][col] != 0) {
                matrix[j][col] = 9939;
            }
        }

        // Mark the current cell
        matrix[row][col] = 9939;
    }

    public void setZeroes(int[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        // Step 1: Mark cells with 9939
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    findZero(i, j, matrix);
                }
            }
        }

        // Step 2: Convert 9939 → 0
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 9939) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}