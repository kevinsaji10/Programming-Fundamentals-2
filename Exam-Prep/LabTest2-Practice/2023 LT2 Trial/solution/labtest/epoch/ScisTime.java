package labtest.epoch;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

/**
 * labtest.epoch.ScisTime is an immutable time object that represents a time, often viewed as hour:minute.
 * For example, the value "23:00" can be stored in a labtest.epoch.ScisTime.
 */
public class ScisTime implements Comparable<ScisTime> {
    private LocalTime time;

    /**
     * Constructor
     * @param text a string in the format "HH:mm"
     */
    public ScisTime(String text) {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("HH:mm");
        this.time = LocalTime.parse(text, fmt);
    }


    /**
     * Constructor
     * @param hour the hour-of-day to represent, from 0 to 23
     * @param minute the minute-of-hour to represent, from 0 to 59
     */
    public ScisTime(int hour, int minute) {
        this.time = LocalTime.of(hour, minute);
    }


    private ScisTime(LocalTime time) {
        this.time = this.time;
    }

    /**
     * Checks if this time is after the specified time (i.e. parameter another).
     * @param specified the other time object
     * @return true if this time is after another. Otherwise, returns false.
     */
    public boolean isAfter(ScisTime specified) {
        return time.isAfter(specified.time);
    }

    /**
     * Checks if this time is before the specified time.
     * @param specified the other time object
     * @return true if this time is before the specified time
     */
    public boolean isBefore(ScisTime specified) {
        return time.isBefore(specified.time);
    }

    LocalTime getTime() {
        return time;
    }

    /**
     * Compares this time to another time.
     * The comparison is primarily based on the time, from earliest to latest.
     * @param another  the other labtest.epoch.ScisTime to compare to, not null
     * @return the comparator value, negative if less, positive if greater
     */
    public int compareTo(ScisTime another) {
        return time.compareTo(another.time);
    }

    /**
     * Checks if this time is equal to another time.
     *
     * @param obj the object to check, null returns false
     * @return true if this is equal to the other time
     */
    public boolean equals(Object obj) {
        if (!(obj instanceof ScisTime)) {
            return false;
        }
        ScisTime another = (ScisTime)obj;
        return time.equals(another.time);
    }

    /**
     * A hash code for this time.
     * @return a suitable hash code.
     */
    public int hashCode() {
        return Objects.hashCode(time);
    }

    /**
     * Outputs this time as a String in this format "dd/MM/yyyy"
     * @return a string representation of this time-time, not null
     */
    public String toString() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("HH:mm");
        return fmt.format(time);
    }


//    public static void main(String[] args) {
//        System.out.println(new ScisTime("12:12"));
//
//    }

}
