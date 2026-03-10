package Tuseday10;

import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {

        String str1 = "listen";
        String str2 = "silent";

        // Convert to lowercase
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // Convert strings to char arrays
        char[] a = str1.toCharArray();
        char[] b = str2.toCharArray();

        // Sort arrays
        Arrays.sort(a);
        Arrays.sort(b);

        // Compare arrays
        if (Arrays.equals(a, b)) {
            System.out.println("Strings are Anagrams.");
        } else {
            System.out.println("Strings are Not Anagrams.");
        }
    }
}