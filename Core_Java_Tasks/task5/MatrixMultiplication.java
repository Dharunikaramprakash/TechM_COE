package pack5;

import java.util.Arrays;

public class MatrixMultiplication {
    public static void main(String[] args) throws Exception{
        int[][] mat1 = {{2,4,6},{8,10,12},{14,16,18}};
        int[][] mat2 = {{3,6,9},{12,15,18},{21,24,27}};
        int row1 = mat1.length;
        int col2 = mat2[0].length;
        int[][] res = new int[row1][col2];
        MatrixMultiplicationThread[] threads = new MatrixMultiplicationThread[row1];
        for (int i = 0; i < row1; i++) {
            threads[i] = new MatrixMultiplicationThread(i, res, mat1, mat2);
            threads[i].start();
            threads[i].join();
        }
        System.out.println("Resultant Matrix:");
        for (int[] row : res) {
            System.out.println(Arrays.toString(row));
        }
    }
}

class MatrixMultiplicationThread extends Thread {
    private int row;
    private int[][] res;
    private int[][] mat1;
    private int[][] mat2;
    public MatrixMultiplicationThread(int row, int[][] res, int[][] mat1, int[][] mat2) {
        this.row = row;
        this.res = res;
        this.mat1 = mat1;
        this.mat2 = mat2;
    }
    public void run() {
        int col2 = mat2[0].length;
        int col1 = mat1[0].length;
        for (int j = 0; j < col2; j++) {
            res[row][j] = 0;
            for (int k = 0; k < col1; k++) {
                res[row][j] += mat1[row][k] * mat2[k][j];
            }
        }
    }
}

