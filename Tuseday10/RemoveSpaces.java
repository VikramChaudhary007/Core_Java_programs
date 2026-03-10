package Tuseday10;

public class RemoveSpaces {
    public static void main(String[] args) {

        String str = "Java programming is fun";

        String result = str.replace(" ", "");

        System.out.println("Original String: " + str);
        System.out.println("String without spaces: " + result);
    }
}