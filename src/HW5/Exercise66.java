// Prof. Ed Harcourt
// Homework 5
// Submitted on 10/06/2022

package HW5;

import java.util.Scanner;

public class Exercise66 {

    public static boolean canSpell(String word, String tiles) {
        String New = "";
        // run a nested loop for the two parameters.
        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < tiles.length(); j++) {

                // if condition for if the characters were the same.
                if ((word.charAt(i)) == (tiles.charAt(j))){
                    New = New + (tiles.charAt(j));
                    // slicing the word and giving new values to the variable tiles.
                    tiles = tiles.substring(0, j) + tiles.substring(j + 1, tiles.length());


                    // just to test if the program runs correctly by checking the new appends.
                    // used when writing the code.
                    // System.out.println(New);
                    if (New.equals(word)){
                        return true;
                    }
                    break; // break is basically exiting the loop after finding the letter.
                    }
                }
            }
        return false; // for loop
        }



    public static void main(String [] args) {
        System.out.println(canSpell("boot", "axobasrto"));// should be true
        System.out.println(!canSpell("hippo", "haxobapsrito")); // true
        System.out.println(!canSpell("bed", "abcdefgh")); // false
        System.out.println(canSpell("scott", "scooter")); // false
        System.out.println(canSpell("scanner", "shitnittenagrocmn")); // true
        System.out.println(canSpell("christmastree", "thromstchiasoieer")); // true
    }
}
