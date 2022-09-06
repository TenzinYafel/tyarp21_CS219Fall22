/*
Tenzin Yarphel
09/ 06/ 2022
HW 2
 */

package HW2;
// import Scanner from util.
import java.util.Scanner;
// creating a class named DayofWeek

public class DayOfWeek {
    // create a function with 3 parameters of month, day and years in that order.
    public static int dayofweek(int m, int d, int y) {
        // input the function from canvas
        // probably use an int type to return integers 1 to 6.
        int y0 = y-((14-m)/12);
        int x = y0 + y0/4 - y0/100 +y0/400;
        int m0 = m + 12 * ((14-m)/12) -2;
        int d0 = (d + x + (31 * m0)/12) % 7;

        // return d0 but in numbers.
        return d0;
    }

    // main program that will ask the user to input.
    public static void main(String [] args){
        Scanner kbd = new Scanner(System.in);

    // program to ask the user to input.
    // use int as a type and then kbd.next should be kbd.nextInt().
        System.out.print("Type the month in integers 1-12: ");
        int month = kbd.nextInt();

        System.out.print("Type the day in integers 1-31: ");
        int day = kbd.nextInt();

        System.out.print("Type the year in integers: ");
        int year = kbd.nextInt();

    // print out the result in an int.
        System.out.printf("The day of the week at year " + year + ", month " + month + " and day " +  day + " is " + (dayofweek (month, day, year )) + ".");

    }
}
