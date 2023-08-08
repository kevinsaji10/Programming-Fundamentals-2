package labtest;

import labtest.Employee;

/**
 * An abstraction of a labtest.Meeting.
 * It has 3 attributes (id, timeslot, attendees).
 */
public class Meeting {
    private String id;
    private TimeSlot slot;
    private Employee[] attendees;

    /**
     * Constructor
     * @param id the meeting id
     * @param slot the timeslot (start and end time)
     */
    public Meeting(String id, TimeSlot slot) {
        this.id = id;
        this.slot = slot;
    }

    /**
     * Constructor
     * @param id the meeting id
     * @param slot the timeslot (start and end time)
     * @param attendees the attendees.
     */
    public Meeting(String id, TimeSlot slot, Employee[] attendees) {
        this.id = id;
        this.slot = slot;
        this.attendees = attendees;
    }

    /**
     * the meeting id.
     * @return the meeting id.
     */
    public String getId() {
        return id;
    }

    /**
     * the start and end timings of the meeting.
     * @return the TimeSlot.
     */
    public TimeSlot getSlot() {
        return slot;
    }

    /**
     * the employees attending the meeting
     * @return an array of labtest.Employee objects.
     */
    public Employee[] getAttendees() {
        return attendees;
    }

    /**
     * Textual representation
     * @return a string with the meeting id.
     */
    public String toString() {
        return "" + id;
    }
}
