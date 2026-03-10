package Tuseday10;

public class CountWords {
    public static void main(String[] args) {

        String sentence = "Java programming is very interesting.";

        String[] words = sentence.split(" ");

        int count = words.length;

        System.out.println("Total words: " + count);
    }
}