// Exercise 2.3
// Submitted by Tenzin Yarphel
public class Time {
    public static void main(String [] args){

        // Question 2 of the exercise.
        System.out.print("The current time is ");
        int hour = 20;
        int minute = 34;
        int second = 23;
        System.out.print(hour);
        System.out.print(":");
        System.out.print(minute);
        System.out.print(":");
        System.out.print(second);
        System.out.println(" PM.");

        // Question 3 of the exercise.
        int totaltime = 60 * 60 * 24;

        // turning everything into seconds.
        double timenow = (minute * 60) + second + (hour * 60 * 60) ;

        // Question 4 of the exercise.
        System.out.print("Seconds left till midnight is ");
        System.out.print(totaltime - timenow);
        System.out.println(" seconds.");

        // Question 5 of the exercise.
        System.out.print("The percent of the day that has passed is ");
        double percent = (timenow / totaltime) * 100;
        System.out.print(Math.round(percent));
        System.out.println(" %");

        // Question 6 of the exercise.
        System.out.print("The current time since working on this exercise is ");
        int hour2 = 20;
        int minute2 = 53;
        int second2 = 46;
        System.out.print(hour2);
        System.out.print(":");
        System.out.print(minute2);
        System.out.print(":");
        System.out.print(second2);
        System.out.println(" PM.");

        // in order to calculate the amount of time it took for me to reach this exercise.
        System.out.print("The time it took me to reach this exercise is ");
        int elapsedhour = hour2 - hour;
        int elapsedminute =  minute2 - minute;
        int elapsedsecond = second2- second;
        System.out.print(elapsedhour);
        System.out.print("hours ");
        System.out.print(elapsedminute);
        System.out.print("minutes and ");
        System.out.print(elapsedsecond);
        System.out.println("seconds.");








    }
}
