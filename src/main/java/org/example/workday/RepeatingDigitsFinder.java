package org.example.workday;

import java.util.HashSet;

public class RepeatingDigitsFinder {

    public static void main(String[] args) {
        int startRange = 100;
        int endRange = 200;

        System.out.println("Repeating digits between " + startRange + " and " + endRange + ": " +
                findRepeatingDigitsInRange(startRange, endRange));
    }

    public static HashSet<Integer> findRepeatingDigitsInRange(int start, int end) {
        HashSet<Integer> result = new HashSet<>();

        for (int i = start; i <= end; i++) {
            if (hasRepeatingDigits(i)) {
                result.add(i);
            }
        }

        return result;
    }

    public static boolean hasRepeatingDigits(int number) {
        HashSet<Character> seenDigits = new HashSet<>();
        char[] digits = String.valueOf(number).toCharArray();

        for (char digit : digits) {
            if (!seenDigits.add(digit)) {
                // If the digit is already in the set, it's a repeating digit
                return true;
            }
        }

        return false;
    }
}
