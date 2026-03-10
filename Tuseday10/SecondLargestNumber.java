package Tuseday10;

import java.util.Arrays;

public class SecondLargestNumber {
    public static void main(String[] args) {

        int[] arr = {10, 25, 8, 40, 15, 35};

        // Sort the array
        Arrays.sort(arr);

        // Second largest element
        int secondLargest = arr[arr.length - 2];

        System.out.println("Second Largest Number: " + secondLargest);
    }
}