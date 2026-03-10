package Tuseday10;

public class RotateArray {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int k = 2; // number of positions to rotate

        int n = arr.length;

        // Rotate array
        for (int i = 0; i < k; i++) {
            int first = arr[0];

            for (int j = 0; j < n - 1; j++) {
                arr[j] = arr[j + 1];
            }

            arr[n - 1] = first;
        }

        // Print rotated array
        System.out.print("Rotated Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}