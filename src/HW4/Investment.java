// Homework Assignment 4
// 09/19/2022

package HW4;

import java.util.Scanner;

public class Investment {
    public static double investment(double c, double r, int t, int n) {

        return c * Math.pow(1 + r / n, t * n);
    }

    public static double getc(Scanner s) {
        boolean valid = false;
        double initialInvestment = 0;

        while (!valid) {
            System.out.print("Please enter initial deposit as a decimal:");

            // if statement if the statement is true.
            if (s.hasNextDouble()) {
                initialInvestment = s.nextDouble();
                // if condition if the variable is less than or equal to 0.
                if (initialInvestment <= 0) {

                    // print out if the variable is less than or equal to 0.
                    System.out.println("Error: Initial deposit should be greater than zero. you entered" + initialInvestment);
                } else {
                    valid = true;
                }
                // print out the following if the if statement is inputted in alphabet.
            } else {
                System.out.println("Error: integer expected. you entered '" + s.next() + "'");
            }
        }
        return initialInvestment;
    }

    public static double getr(Scanner s) {
        boolean valid = false;
        double interestrate = 0;
        while (!valid) {

            System.out.print("Please enter interest rate as a decimal:");
            if (s.hasNextDouble()) {
                interestrate = s.nextDouble();

                if (interestrate > 0 && interestrate < 1) {
                    valid = true;
                }

                // if statement if the value is less than 0 hence no negative numbers.
                if (interestrate < 0) {
                    System.out.printf("Error: Interest rate has to be a positive number between 0 and 1. You entered %.2f", interestrate);
                    System.out.println("");
                }

                // if statement when the value input is more than 1 hence to be true it has to be less than 1
                // and more than 0 to run.
                else if (interestrate > 1) {
                    System.out.printf("Error: Interest should be expressed as decimal between 0 and 1.\n"
                            + "For example 8%% should be entered as .08. You entered %.2f", interestrate);
                    System.out.println("");
                }
            }
            else{
                System.out.println("Error: decimal number expected. You entered '" + s.next() + "'");
            }
        }
        return interestrate;
    }

    public static int gett(Scanner s) {
        boolean valid = false;
        int time = 0;

        while (!valid) {
            // number of years should be in numbers and cannot be less than 0.
            System.out.print("Please enter number of years as an integer:");

            // if statement if the statement is true.
            // change now to hasNextInt since it is an integer.
            if (s.hasNextInt()) {
                time = s.nextInt();
                // if condition when the variable input in s is less than or equal to 0.
                if (time < 0) {

                    // print out if the variable is less than or equal to 0.
                    System.out.println("Error: Number of years should be greater than zero. you entered" + time);
                } else {
                    valid = true;
                }
                // print out the following if the if statement is inputted in alphabet.
            } else {
                System.out.println("Error: please enter a numerical. you entered '" + s.next() + "'");
            }
        }
        return time;
    }

    public static int getn(Scanner s) {
        boolean valid = false;
        int numberOfCompound = 0;

        while (!valid) {

            System.out.print("Please enter the number of times to compound per year as an integer:");

            // if statement if the statement is true.
            if (s.hasNextInt()) {
                numberOfCompound = s.nextInt();
                // if condition when the variable input in s is less than or equal to 0.
                if (numberOfCompound < 0) {

                    // print out if the variable is less than or equal to 0.
                    System.out.println("Error: Number of times compounded should be greater than zero. you entered" + numberOfCompound);
                } else {
                    valid = true;
                }

            }

            // print out the following if the if statement is inputted in alphabet.
            else {
                System.out.println("Error: please enter a numerical. you entered '" + s.next() + "'");
            }
        }
        return numberOfCompound;
    }

    public static void main(String[] args) {

        // create a scanner.
        Scanner s = new Scanner(System.in);

        double initialInvestment = getc(s);
        double interestRate = getr(s);
        int time = gett(s);
        int numberOfCompound = getn(s);

        // final investment calculation.
        // make sure to call the right packages for the function to run with correct variables.
        System.out.printf("Your investment is worth $%.2f ",
                HW4.Investment.investment(initialInvestment, interestRate, time, numberOfCompound));
    }
}
