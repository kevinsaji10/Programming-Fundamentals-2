package labtest.epoch;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

import static java.time.temporal.ChronoUnit.MINUTES;

/**
 * LocalDateTime is an immutable date-time object that represents a date-time (year-month-day-hour-minute).
 * For example, the value "2nd October 2021 13:45" can be stored in a labtest.epoch.ScisDateTime.
 */
public class ScisDateTime implements Comparable<ScisDateTime> {
    private LocalDateTime dateTime;


    /**
     * Constructor
     * @param dateTimeText a string in the format "dd/MM/yyyy HH:mm"
     */
    public ScisDateTime(String dateTimeText) {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        this.dateTime = LocalDateTime.parse(dateTimeText, fmt);
    }

    /**
     * Constructor
     * @param year the year
     * @param month the month
     * @param day the day of month
     * @param hour the hour-of-day, from 0 to 23
     * @param minute the minute-of-hour, from 0 to 59
     */
    public ScisDateTime(int day, int month, int year, int hour, int minute) {
        this.dateTime = LocalDateTime.of(year, month, day, hour, minute);
    }

     ScisDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    /**
     * Checks if this date-time is after the specified date-time.
     * @param specified the other date-time object
     * @return true if this date-time is after the specified date-time
     */
    public boolean isAfter(ScisDateTime specified) {
        return dateTime.isAfter(specified.dateTime);
    }

    /**
     * Checks if this date-time is before the specified date-time.
     * @param specified the other date-time object
     * @return true if this date-time is before the specified date-time
     */
    public boolean isBefore(ScisDateTime specified) {
        return dateTime.isBefore(specified.dateTime);
    }



    /**
     * Gets the date part of this date-time.
     * This returns a labtest.epoch.ScisDate with the same year, month and day as this date-time.
     * @return the labtest.epoch.ScisDate object.
     */
    public ScisDate getDate() {
        LocalDate dateOnly = dateTime.toLocalDate();
        return new ScisDate(dateOnly.getDayOfMonth(), dateOnly.getMonthValue(), dateOnly.getYear());
    }

    /**
     * Returns a labtest.epoch.ScisDate with the specified number of days added.
     * @param numDays the days to add, may be negative
     * @return the new object.
     */
    public ScisDateTime plus(int numDays) {
        return new ScisDateTime(dateTime.plus(numDays, ChronoUnit.DAYS));
    }

//    public int difference()
    /**
     * Checks if this date-time is equal to another date-time.
     *
     * @param obj the object to check, null returns false
     * @return true if this is equal to the other date-time.
     */
    public boolean equals(Object obj) {
        if (!(obj instanceof ScisDateTime)) {
            return false;
        }
        ScisDateTime another = (ScisDateTime)obj;
        return dateTime.equals(another.dateTime);
    }

    /**
     * A hash code for this date-time.
     * @return a suitable hash code.
     */
    public int hashCode() {
        return Objects.hashCode(dateTime);
    }

    /**
     * Compares this date-time to another date-time.
     * The comparison is primarily based on the date-time, from earliest to latest.
     * @param another  the other labtest.epoch.ScisDateTime to compare to, not null
     * @return the comparator value, negative if less, positive if greater
     */
    public int compareTo(ScisDateTime another) {
        return dateTime.compareTo(another.dateTime);
    }

    /**
     * Outputs this date as a String in this format "dd/MM/yyyy HH:mm"
     * @return a string representation of this date-time, not null
     */
    public String toString() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        return fmt.format(dateTime);
    }

    /**
     * Gets the day of week (1 - Mon, 2 - Tue,  ..., 7 - Sun)
     * @return the day of week.
     */
    public int getDayOfWeek() {
        return dateTime.getDayOfWeek().getValue();
    }

//     LocalDateTime getDateTime() {
//        return dateTime;
//    }

    /**
     * Calculates the amount of time until another date-time in terms of minutes.
     * @param another  the end date, exclusive, not null
     * @return the number of minutes between this date-time and the end date-time
     */
    public long until(ScisDateTime another) {
        return dateTime.until(another.dateTime, MINUTES);
    }

//    public static void main(String[] args) {
//        labtest.epoch.ScisDateTime dt1 =  new labtest.epoch.ScisDateTime(2021, 10, 1, 11, 10);
//        labtest.epoch.ScisDateTime dt2 =  new labtest.epoch.ScisDateTime(2021, 10, 1, 10, 12);
//        System.out.println(dt1.until(dt2));
//    }

}
