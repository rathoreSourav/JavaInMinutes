package org.example.practice;

public class RotateMatrix {
    public static int[][] rotateMatrix(int[][] mat){
        //transpose
        //reverse

        for(int i = 0; i < mat.length; i++){
            for(int j = i+1; j < mat[0].length; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[i][j] = temp;
            }
        }
        //reverese each row
        for(int row = 0; row < mat.length; row++){
            int left = 0;
            //int row = mat.length;
            int right = mat[0].length - 1;
            while(left < right){
                int temp = mat[row][left];
                mat[row][left] = mat[row][right];
                mat[row][right] = temp;
                row++;
                right--;
            }
        }
        return mat;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        rotateMatrix(arr);
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();}
    }
}
