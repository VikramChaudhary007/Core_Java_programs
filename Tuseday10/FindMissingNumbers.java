package Tuseday10;

import java.util.Scanner;

public class FindMissingNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many numbers you will input: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the numbers Between (0 to 100):");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Missing numbers are:");

        for (int i = 0; i <= 100; i++) {
            boolean found = false;

            for (int j = 0; j < size; j++) {
                if (arr[j] == i) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}