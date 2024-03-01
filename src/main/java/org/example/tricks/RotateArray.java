package org.example.tricks;

import java.util.Arrays;

public class RotateArray {
    public static int[][] rotateRowstoColumn(int[][] matrix){
        // 100,201 410,511
        //0,0, 1,0, 2,0
        //00, 01, 10, 11
        //1,4, 2,5
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] matres = new int[rows][cols];

        for(int i = 0; i < rows; i++){
           // int tempi = matrix[i];
            for(int j =0; j < cols; j++){

                    //swap i with j
                    matres[i][j] = matrix[j][i];


            }
        }
        return matres;
    }

    public static void main(String[] args) {
        int[][] mat = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int rows = mat.length;
        int cols = mat[0].length;

        for(int i = 0; i < rows; i++){
            for(int j =0; j < cols; j++) {
                System.out.print(mat[i][j]);
            }
            System.out.println();
        }
        System.out.println("After");
        int[][] res = rotateRowstoColumn(mat);
        for(int i = 0; i < rows; i++){
            for(int j =0; j < cols; j++) {
                System.out.print(res[i][j]);
            }
            System.out.println();
        }

    }
}
