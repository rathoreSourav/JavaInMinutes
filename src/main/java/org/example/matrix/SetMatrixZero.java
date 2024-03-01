package org.example.matrix;

import java.util.Arrays;

public class SetMatrixZero {
    public static void setMatrixZero(int[][] matrix){

        int rows = matrix.length;
        int cols = matrix[0].length;

        boolean[] rowsZeroes = new boolean[rows];
        boolean[] colsZeroes = new boolean[cols];

        //find zero
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(matrix[i][j] == 0){
                    //mark the rows and cols
                    rowsZeroes[i] = true;
                    colsZeroes[j] = true;
                }
            }
        }
        //set rows to zero
        for (int i = 0; i < rows; i++){
            if(rowsZeroes[i] == true){
                Arrays.fill(matrix[i], 0);
            }
            for(int j = 0; j < cols; j++){
                if(colsZeroes[j] == true)
                    matrix[i][j] = 0;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {0,1,2,0},
                {3,4,5,2},
                {1,3,1,5}
        };
        setMatrixZero(matrix);
        for(int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.println(matrix[i][j]);
            }
            }
        }
}
