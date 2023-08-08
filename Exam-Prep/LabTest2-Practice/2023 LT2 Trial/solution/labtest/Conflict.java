package labtest;

/**
 * Stores a conflict between 2 meetings.
 */
public class Conflict {
    private Meeting meeting1;
    private Meeting meeting2;

    /**
     * Constructor
     * @param first the first meeting
     * @param second the second meeting
     */
    public Conflict(Meeting first, Meeting second) {
        this.meeting1 = first;
        this.meeting2 = second;
        if (meeting1.getId().compareTo(meeting2.getId()) > 0) {
            this.meeting1 = second;
            this.meeting2 = first;
        }
    }

    /**
     * Gets the meeting with the smaller meeting id.
     * @return the meeting
     */
    public Meeting getMeeting1() {
        return meeting1;
    }

    /**
     * Gets the meeting with the larger meeting id.
     * @return the meeting
     */
    public Meeting getMeeting2() {
        return meeting2;
    }

    /**
     * Textual representation
     * @return a string in this format (id1, id2) where id1 &lt; id2.
     */
    public String toString() {
        return "(" +  meeting1.getId() + ", " + meeting2.getId() + ")";
    }
}
