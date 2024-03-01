package org.example.arrays;

class Solution {
    public boolean increasingTriplet(int[] nums) {
        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num <= firstMin) {
                firstMin = num;
            } else if (num <= secondMin) {
                secondMin = num;
            } else {
                return true; // Found increasing triplet
            }
        }
        return false; // No increasing triplet found
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {2,1,5,0,4,1};
        System.out.println(solution.increasingTriplet(nums)); // Output: true (1 < 2 < 3)
    }
}