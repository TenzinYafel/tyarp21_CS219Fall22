package HW6;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class SwallowStats {

    public static void swallow_stats1(){

    // connect to the web page of speeds.
    URL url = null; // null is the "nothing value"
    Scanner s = null;
    String path = "http://10.60.15.25/~ehar/cs219/swallow-speeds.txt";

        try {
        url = new URL(path); // create a URL object for the path
        s = new Scanner(url.openConnection().getInputStream());
    } catch (
    IOException e) {
        throw new RuntimeException(e);
    }


    double sum = 0.0;
    int count = 0;
    double minimum = Double.POSITIVE_INFINITY;
    double maximum = -Double.POSITIVE_INFINITY;

        while (s.hasNextLine()) {

        String line = s.nextLine(); // read a line of the web site.
        if (line.equals("")){
            continue;
        }
        if (!line.contains("#")) { // modify condition
            sum = sum + Double.parseDouble(line);
            count++;

            if (minimum > Double.parseDouble(line)) {
                minimum = Double.parseDouble(line);
            }
            if (maximum < Double.parseDouble(line)) {
                maximum = Double.parseDouble(line);
            }
        }
    }
        System.out.printf("Average swallow speed is %.2f\n", sum / count);
        System.out.println( "The minimum swallow speed is " +  minimum);
        System.out.println("The maximum swallow speed is " + maximum);

} // average swallow speed.

    public static void main(String[] args) {
        // call the function just once and it will print out the answers.
        swallow_stats1();
    }
}
