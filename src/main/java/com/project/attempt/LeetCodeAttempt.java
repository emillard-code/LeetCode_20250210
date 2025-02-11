package com.project.attempt;

public class LeetCodeAttempt {

    public static void main(String[] args) {

        System.out.println(clearDigits("abc"));
        System.out.println(clearDigits("cb34"));

    }

    // This method returns the resultant string after removing all
    // digits from the initial string as per challenge specifications.
    public static String clearDigits(String s) {

        StringBuilder sb = new StringBuilder(s);

        // This while loop continues while there are still any digits left in the string.
        while (hasDigits(String.valueOf(sb))) {

            for (int i = 0; i < sb.length(); i++) {

                // If a digit is found, we need to check if it is at index 0 or not.
                if (Character.isDigit(sb.charAt(i))) {

                    // If it is at index 0, simply delete it.
                    // Otherwise, delete the previous character as well, as per challenge specifications.
                    if (i == 0) {
                        sb.deleteCharAt(0);
                    } else {
                        sb.deleteCharAt(i);
                        sb.deleteCharAt(i-1);
                    }

                    break;

                }

            }

        }

        // Return the resultant string once no digits are left.
        return sb.toString();

    }

    // This is a helper method that checks if there are any digits in string s.
    private static boolean hasDigits(String s) {

        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) { return true; }
        }

        return false;

    }

}
