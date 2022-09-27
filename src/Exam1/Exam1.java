// Tenzin Yarphel
// 09/27/2022
package Exam1;

import java.util.Scanner;

public class Exam1 {

    // create an integer function that counts the number of digits.
    public static int countTwoAndSeven(int n){

        // initialize the check integer variable we will be using to get the last digit of the number and check.
        // get another integer sum variable that we will use to count the digits.
            int check = 0;
            int sum =0;

            // while loop usage.
            while (n > 0) {

                // extract the last digit of the input number until the loop finishes.
                check = n % 10;
                n = n / 10;

                // if condition for the range.
                if (check > 2 && check < 7){
                    sum ++;
                }
        }
            // return sum this is the number we are looking for.
        return sum;
        }

        // code to check if the input is valid.
    public static int getn(Scanner s) {

        // initialize the n again
        int n = 0;
        while (true) {
            System.out.print("Enter your number: ");

            if (s.hasNextInt()) {
                n = s.nextInt();

                // if it is a negative number.
                if (n < 0) {
                    System.out.printf("The number has to be a positive number. You entered %d \n", n);
                } else {
                    return n;
                }
            }
            // if it is not a number at all.
            else
                {
                    String str = s.next();
                    System.out.println("Error: It has to be a number. You entered: '" + str + "'" );
                }
            }
        }
// call main function now to test it out.
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = getn(s);

        System.out.println("There are " + countTwoAndSeven(n) + " digits in number '" + n + "' that are between integers 2 and 7 exclusive");
    }
}
