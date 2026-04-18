package src;

import java.util.Arrays;

public class anagramString {
    public static void main(String[] args) {
        String str1 = "earth";
        String str2 = "heart";

        // convert both strings to lowercase
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // first check - if the lengths are the same
        if (str1.length() == str2.length()) {

            // convert strings into char arrays
            char[] str1CharArray = str1.toCharArray();
            char[] str2CharArray = str2.toCharArray();

            // sort both char arrays
            Arrays.sort(str1CharArray);
            Arrays.sort(str2CharArray);

            // compare sorted arrays
            boolean result = Arrays.equals(str1CharArray, str2CharArray);

            if (result) {
                System.out.println(str1 + " and " + str2 + " are anagrams of each other");
            } else {
                System.out.println(str1 + " and " + str2 + " are not anagrams of each other");
            }

        } else {
            // case when lengths are not equal
            System.out.println(str1 + " and " + str2 + " are not anagrams of each other");
        }
    }
}