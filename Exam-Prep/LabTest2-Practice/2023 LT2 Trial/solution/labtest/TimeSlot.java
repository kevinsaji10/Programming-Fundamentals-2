package labtest;

import labtest.epoch.ScisDateTime;

/**
 * Represents a length of time allotted.
 * It consists of a start (inclusive) and end time (exclusive).
 */
public class TimeSlot {
    private ScisDateTime start;
    private ScisDateTime end;


    /**
     * constructor
     * @param strStart a string in the format "dd/MM/yyyy HH:mm)
     * @param strEnd a string in the format "dd/MM/yyyy HH:mm)
     */
    public TimeSlot(String strStart, String strEnd) {
        this.start = new ScisDateTime(strStart);
        this.end = new ScisDateTime(strEnd);
    }

    /**
     * constructor
     * @param start the start date and time
     * @param end the end date and time
     */
    public TimeSlot(ScisDateTime start, ScisDateTime end) {
        this.start = start;
        this.end = end;
    }

    /**
     * Gets the start date and time.
     * @return an labtest.epoch.ScisDateTime object.
     */
    public ScisDateTime getStart() {
        return start;
    }

    /**
     * Gets the end date and time.
     * @return an labtest.epoch.ScisDateTime object.
     */
    public ScisDateTime getEnd() {
        return end;
    }

    /**
     * Textual representation.
     * @return a string with the start and end time.
     */
    @Override
    public String toString() {
        return "(" + start + ", " + end + ")";
    }

//    public long getDuration() {
//        return Duration.between(start.getDateTime(), end.getDateTime()).toMinutes();
//    }
//    public static void main(String[] args) {
//        LocalDateTime start = LocalDateTime.of(2022, 12, 12, 12, 20);
//        LocalDateTime end = LocalDateTime.of(2022, 12, 12, 13, 21);
//
//        System.out.println(Duration.between(start, end).toMinutes());
//    }
}
