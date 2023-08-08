package labtest.epoch;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

/**
 * LocalDate is an immutable date object that represents a date, often viewed as year-month-day.
 * For example, the value "2nd October 2021" can be stored in a LocalDate.
 */
public class ScisDate implements Comparable<ScisDate> {
    private LocalDate date;

    /**
     * Constructor
     * @param text a string in the format "dd/MM/yyyy"
     */
    public ScisDate(String text) {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.date = LocalDate.parse(text, fmt);
    }

    /**
     * Constructor
     * @param year the year
     * @param month the month
     * @param day the day of month
     */
    public ScisDate(int day, int month, int year) {
        this.date = LocalDate.of(year, month, day);
    }


    private ScisDate(LocalDate date) {
        this.date = date;
    }

    /**
     * Checks if this date is after the specified date (i.e. parameter another).
     * @param specified the other date object
     * @return true if this date is after another. Otherwise, returns false.
     */
    public boolean isAfter(ScisDate specified) {
        return date.isAfter(specified.date);
    }

    /**
     * Checks if this date is before the specified date.
     * @param specified the other date object
     * @return true if this date is before the specified date
     */
    public boolean isBefore(ScisDate specified) {
        return date.isBefore(specified.date);
    }

    /**
     * Returns a labtest.epoch.ScisDate with the specified number of days added.
     * @param numDays the days to add, may be negative
     * @return the new object.
     */
    public ScisDate plusDays(int numDays) {
        System.out.println("CHECK " + date.plus(numDays, ChronoUnit.DAYS));
        return new ScisDate(date.plus(numDays, ChronoUnit.DAYS));
    }

    /**
     * Gets the day of week (1 - Mon, 2 - Tue,  ..., 7 - Sun)
     * @return the day of week.
     */
    public int getDayOfWeek() {
        return date.getDayOfWeek().getValue();
    }

    /**
     * Compares this date to another date.
     * The comparison is primarily based on the date, from earliest to latest.
     * @param another  the other labtest.epoch.ScisDate to compare to, not null
     * @return the comparator value, negative if less, positive if greater
     */
    public int compareTo(ScisDate another) {
        return date.compareTo(another.date);
    }

    /**
     * Combines this date with a time to create a labtest.epoch.ScisDateTime.
     * @param time the time to combine with, not null.
     * @return a labtest.epoch.ScisDateTime object
     */
    public ScisDateTime toDateTime(ScisTime time) {
        return new ScisDateTime(date.atTime(time.getTime()));

    }
    /**
     * Checks if this date is equal to another date.
     *
     * @param obj the object to check, null returns false
     * @return true if this is equal to the other date
     */
    public boolean equals(Object obj) {
        if (!(obj instanceof ScisDate)) {
            return false;
        }
        ScisDate another = (ScisDate)obj;
        return date.equals(another.date);
    }

    /**
     * A hash code for this date.
     * @return a suitable hash code.
     */
    public int hashCode() {
        return Objects.hashCode(date);
    }

    /**
     * Outputs this date as a String in this format "dd/MM/yyyy"
     * @return a string representation of this date-time, not null
     */
    public String toString() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return fmt.format(date);
    }
//
//    public static void main(String[] args) {
//        labtest.epoch.ScisDate d1 = new labtest.epoch.ScisDate("24/08/1975");
//        labtest.epoch.ScisDate d2 = new labtest.epoch.ScisDate("25/08/1975");
//        System.out.println(d2.plusDays(-1));
////        LocalDate date1 = LocalDate.of(2021, 10, 1);
////        LocalDate date2 = LocalDate.of(2021, 10, 3);
////        long daysBetween = ChronoUnit.DAYS.between(date1, date2);
////        System.out.println(daysBetween);
//    }

}
