package org.example.interview.prep;

import java.util.*;
import java.util.stream.Collectors;

public class ArraysQuestions {
    public static void main(String[] args) {

        Integer[] numbers = {1,2,3,4,4, 1, 5,6,7,89,9};
        List<Integer> intList = Arrays.asList(numbers);

        Integer[] numbers1 = {1,3,4};
        List<Integer> intList1 = Arrays.asList(numbers);
        HashSet<Integer> intSet = new HashSet<>(intList1);

       // System.out.println(Collections.);
        //frequency of a number
        System.out.println("frequency of 4: "+ Collections.frequency(intList, 4));

        //using for loop to count frequency and if array
        int countFreq = 0;
        int numToCount = 4;
        for (Integer num : numbers){
            if(num == numToCount)
                countFreq++;
        }
        System.out.println("frequency of 4: "+ countFreq);

        //count frequency of each number and save in linked hash map
        LinkedHashMap<Integer, Long> collect = Arrays.stream(numbers)
                .collect(Collectors
                        .groupingBy(
                                ele -> ele,
                                LinkedHashMap::new,
                                Collectors.counting()
                        )

                );
        System.out.println("collected grouped numbers " + collect);


        String[] strFruits = {
                "Apple",
                "Strawberry",
                "Guava",
                "Apple",
                "Grape",
                "Mango",
                "Meat"
        };

        Map<String, Long> collect1 = Arrays.stream(strFruits).collect(
                Collectors.groupingBy(
                        ele -> ele,
                        Collectors.counting()
                )
        );
        System.out.println(collect1);

        //filter fruites starts with G and count their frequncies
        Map<String, Long> g = Arrays.stream(strFruits).filter(ele -> ele.startsWith("G")).collect(
                Collectors.groupingBy(
                        g1 -> g1,
                        Collectors.counting()
                )
        );
        System.out.println(g);

        //if a string is a substring
        String original = "abcdeabcde";
        String substring ="abcdef";

        //System.out.println("is a  patern of: "+substring.contains(original.));

        //traverse in 2D array
        int[][] matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };

        //find occurence coordinate of an element
        int numToFind = 10;
        for(int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == numToFind){
                    System.out.println("i: "+ i +" j: "+j);
                    break;
                }
            }
        }
        int[][] matrix1 = {
                {1,0,0,4},
                {5,0,0,8},
                {9,0,0,12}
        };

        System.out.println("left:" + Arrays.toString(findTopLeft(matrix1)) +
                ", top Right:"+Arrays.toString(findTopRight(matrix1)));


        int[][] matrix2 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        for(int i = 0 ; i < matrix2.length; i++){
            for(int j = 0; j < matrix2[0].length; j++){
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("AFTER");
        rotateBy90(matrix2);
        for(int i = 0 ; i < matrix2.length; i++){
            for(int j = 0; j < matrix2[0].length; j++){
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }
        //7,4,1
        //
    }
    static int[] findTopLeft(int[][] matrix){

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == 0)
                    return new int[]{i,j};
            }
        }
         return new int[]{-1,-1};
    }

    static int[] findTopRight(int[][] matrix){

        for(int i = matrix.length-1; i > 0; i--){
            for(int j = matrix[0].length-1; j > 0; j--){
                if(matrix[i][j] == 0)
                    return new int[]{i,j};
            }
        }
        return new int[]{-1,-1};
    }
    static void rotateBy90(int[][] matrix){
        //transpose a matrix
        //reverse each row
       transposeMatrix(matrix);
       reverseEachRow(matrix);
    }
    static void transposeMatrix(int[][] matrix){
        for(int rows = 0; rows < matrix.length; rows++){
            for(int cols = rows + 1 ; cols < matrix.length; cols++){
                //swap rows with cols
                int temp =  matrix[rows][cols];
                matrix[rows][cols] = matrix[cols][rows];
                matrix[cols][rows] = temp;
            }
        }
    }

    static void reverseEachRow(int[][] matrix){
        for(int row = 0; row < matrix.length; row++){
            int left = 0;
            int right  = matrix[0].length - 1;

            while(left < right){
                int temp = matrix[row][left];
                matrix[row][left] = matrix[row][right];
                matrix[row][right] = temp;
                row++;
                right--;
            }
        }
    }
}
