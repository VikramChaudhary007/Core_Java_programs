package Tuseday10;

public class SwapNumbers {
    public static void main(String[] args) {

        int a = 67;
        int b = 46;

        System.out.println("Before Swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Swap without third variable
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After Swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}