package Exam2;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class Exam {

    public static String [] load_words(String path, String s) {

        // connect to the web page of speeds.
        URL url = null; // null is the "nothing value"
        Scanner s = null;

        try {
            url = new URL(path); // create a URL object for the path
            s = new Scanner(url.openConnection().getInputStream());
        } catch (
                IOException e) {
            throw new RuntimeException(e);
        }

        // create an array of strings
        String[] words = new String[9];
        int i = 0;
        while (s.hasNextLine()) {
            words[i++] = s.nextLine();
        }
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(isPalindrome(words))){
                return words;
        }
    }
        return words;
    }
    public static String reverse(String s) {

        if (s.length() == 0)
            return "";
        else
            return reverse(s.substring(1)) + s.charAt(0);
    }
    public static boolean isPalindrome(String s) {
        return s.equals(reverse(s));
    }

    public static int check(String target, String[]aos){

    }

    public static void main(String[] args) {
        String []words = load_words("http://10.60.15.25/~ehar/cs219/wordle-nyt-solutions.txt", 2309);
        System.out.println(isPalindrome(words));
    }
}
