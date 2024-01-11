package org.example.workday;

public class MedianOfArray {
    public static double median(int[] arr) {
        int n = arr.length;
        if (n % 2 == 0) {
            int med1 = arr[n / 2];
            int med2 = arr[(n - 1) / 2];
            return (double) (med1 + med2) / 2;
        } else {
            return (double) arr[n / 2];
        }
    }

    public static void main(String[] args) {
        System.out.println(median(new int[]{1, 2, 3, 4, 5, 6, 7, 8}));
    }
}
