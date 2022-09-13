// Homework Assignment 3
// 09/13/2022

package HW3;

import java.util.Scanner;

public class Investment {
    public static double investment(double c, double r, int t, int n) {
        return c * Math.pow(1 + r / n, t * n);
    }

    public static void main(String[] args) {

        // create a scanner.
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter initial deposit as a decimal:");

        // define a variable.
        double initial;

        // if statement if the statement is true.
        if (s.hasNextDouble()) {
            initial = s.nextDouble();
            // if condition if the variable is less than or equal to 0.
            if (initial <= 0) {

                // print out if the variable is less than or equal to 0.
                System.out.println("Error: Initial deposit should be greater than zero. you entered" + initial);

                // quits the program.
                return;

            }

            }

        // print out the following if the if statement is inputted in alphabet.
        else {
            System.out.println("Error: please enter a decimal number. you entered '" + s.next() + "'");
            return;

        }

        System.out.print("Please enter interest rate as a decimal:");
        double rate;
        if (s.hasNextDouble()){
            rate = s.nextDouble();
            // if statement if the value is less than 0 hence no negative numbers.
            if( rate < 0) {
                System.out.println("Error: Interest should be expressed as decimal between 0 and 1.\n"
                        + "For example 8% should be entered as .08. You entered " + s.next());
                return;
            }

            // if statement when the value input is more than 1 hence to be true it has to be less than 1
            // and more than 0 to run.
                if( rate > 1){
                    System.out.printf("Error: Interest should be expressed as decimal between 0 and 1.\n"
                            + "For example 8%% should be entered as .08. You entered %.3f", rate);
                    return;
            }
        }
        // if the input value is inputted as an alphabet.
        else{
            System.out.println("Error: decimal number expected. You entered '" +  s.next() + "'");
            return;
        }

        // number of years should be in numbers and cannot be less than 0.
        System.out.print("Please enter number of years as an integer:");
        // define a variable.
        int years;

        // if statement if the statement is true.
        // change now to hasNextInt since it is an integer.
        if (s.hasNextInt()) {
            years = s.nextInt();
            // if condition when the variable input in s is less than or equal to 0.
            if (years < 0) {

                // print out if the variable is less than or equal to 0.
                System.out.println("Error: Number of years should be greater than zero. you entered" + years);

                // quits the program.
                return;

            }

        }

        // print out the following if the if statement is inputted in alphabet.
        else {
            System.out.println("Error: please enter a numerical. you entered '" + s.next() + "'");
            return;

        }

        System.out.print("Please enter the number of times to compound per year as an integer:");
        // define a variable.
        int compound;

        // if statement if the statement is true.
        if (s.hasNextInt()) {
            compound = s.nextInt();
            // if condition when the variable input in s is less than or equal to 0.
            if (compound < 0) {

                // print out if the variable is less than or equal to 0.
                System.out.println("Error: Number of times compounded should be greater than zero. you entered" + compound);

                // quits the program.
                return;

            }

        }

        // print out the following if the if statement is inputted in alphabet.
        else {
            System.out.println("Error: please enter a numerical. you entered '" + s.next() + "'");
            return;

        }

        // final investment calculation.
        // make sure to call the right packages for the function to run with correct variables.
        System.out.printf("Your investment is worth $%.2f ",
                HW3.Investment.investment(initial, rate, years, compound));
    }
}
