package Exam2;

import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.Scanner;

public class Exam2Redo {
    public static String reverse(String s) {

        if (s.length() == 0)
            return "";
        else
            return reverse(s.substring(1)) + s.charAt(0);
    }
    public static boolean isPalindrome(String s) {
        return s.equals(reverse(s));
    }
    public static String[] load_words(String path, int n) {

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

        // create an array of list of all the words from the website that are palindromes
        String[] words = new String[n];
        int i = 0;
        while (s.hasNextLine()) {
            String nextword = s.nextLine();
            if(isPalindrome(nextword)){
                words[i++] = nextword;
            }
        }
        return words;
    }
    public static String[] reverseWords(String []aos) {
        // create a new temporary string to hold the words.
        String temp;

        // loop through from end to top hence a mid is required where it breaks.
        int mid = aos.length / 2;
        int j = aos.length-1;
        for(int i = 0; i<aos.length;i++) {
                temp = aos[i];
                aos[i] = aos[j];
                aos[j] = temp;
            j--;
                if(i == mid || j==mid)
                    break;
        }
        return aos;
    }
    public static void main(String[] args) {
        // change the n here to 9 since we know there are only 9 palindromes.
        String[] words = load_words("http://10.60.15.25/~ehar/cs219/wordle-nyt-solutions.txt", 9);
        System.out.println(Arrays.toString(reverseWords(words)));
    }
}

