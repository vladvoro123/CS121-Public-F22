package lab;

import java.time.LocalTime;
import java.util.ArrayList;

/**
 * This class allows you to schedule any number of amounts per day
 * and specify, in grams, how much to feed
 *
 * @author krodgers
 * @author YOUR-NAME-GOES-HERE
 */

public class AutomaticFeeder {

    // parallel arrays - at feedTimes[x], amounts[x] grams of food is
    // dispensed
    private ArrayList<LocalTime> feedTimes; // times to feed

    private ArrayList<Double> amounts; // amount to feed


    /**
     * Constructor
     */
    public AutomaticFeeder() {
	    feedTimes = new ArrayList<LocalTime>();
	    amounts = new ArrayList<Double>();
    }

    /**
     * Adds a feeding time and amount.
     *
     * If a duplicate time is added, the new amount will overwrite the old amount.
     * If invalid hour, minute, or amount is given, the feeding will not be added.
     *
     * @param hour - the hour of the feeding time, from 0 to 23
     * @param min  - the minute of the feeding time, from 0 to 59
     * @param amt  - the amount of food to feed in grams
     */
    public void addFeeding(int hour, int min, double amt) {

        if (hour < 0 || hour > 23 || min < 0 || min > 59 || amt <= 0) {
            return; 
        }
        
        // create new time object
        LocalTime time = LocalTime.of(hour, min);

        // put new time in correct order
        if (feedTimes.isEmpty()) {
            // add time
            feedTimes.add(time);
            // add amount
            amounts.add(amt);
        } else {
            int i = 1;
            // find index to put time
            while (i < feedTimes.size() - 1 && feedTimes.get(i).isBefore(time)) {
                i++;
            }
            // add time
            feedTimes.add(i, time);

            // add amount
            amounts.add(i, amt);
        }
    }

    /**
     * Removes the feeding scheduled at hour:min
     *
     * Does nothing and returns false if the time is not a currently
     * scheduled time.
     *
     * @param hour - the hour of the feeding time, from 0 to 23
     * @param min  - the minute of the feeding timem, from 0 to 59
     * 
     * @return true if successfully removed the feeding; false otherwise
     */
    public boolean removeFeeding(int hour, int min) {
        // if nothing is scheduled, return false
        if (feedTimes.isEmpty()) {
            return false;
        }

        // create object to compare
        LocalTime toFind = LocalTime.of(hour, min);

        // find a matching object in feedingTime
        int index = feedTimes.indexOf(toFind);

        // if found, remove feeding and amount
        // return true
        if (index >= 0) {
            feedTimes.remove(index);
            amounts.remove(index);
            return true;
        }

        // if not found, return false
        return false;

    }

    /**
     * Returns the amount of food that is dispensed at hour:min
     *
     * @param hour - the hour of the feeding time, from 0 to 23
     * @param min  - the minute of the feeding time, from 0 to 59
     *
     * @return amount fed at hour:min or -1 if no such feeding time exists
     */

     
    public double getAmount(int hour, int min) {
        // if there are no times scheduled, return -1
        if (feedTimes.isEmpty()) {
            return -1;
        }
        // create object to compare
        LocalTime toFind = LocalTime.of(hour, min);

        // find a matching object in feedingTime
        int index = feedTimes.indexOf(toFind);

        if (index == -1) {
            return -1; // Feeding time not found.
        }
        
        // return amount
        return amounts.get(index);
    }

    /**
     * Prints the time and amount of each feeding in the format
     * 
     * Time Amount
     * ---------------
     * time -- amount
     * time -- amount
     */
    @Override
    public String toString() {

        String res = String.format("%-6s -- %s\n", "Time", "Amount");
        res += "-".repeat(15) + "\n";
        for (int i = 0; i < feedTimes.size(); i++) {
            res += String.format("%-6s -- %.2f\n",
                    feedTimes.get(i).toString(), amounts.get(i));
        }

        return res;
    }
}
