import java.util.Arrays;
import java.util.Objects;

public class Section {
    private String number;
    private Course course;
    private Staff[] staff;


    public Section(String number, Course course, Staff[] staff) {
        this.number = number;
        this.course = course;
        this.staff = staff;
    }

    public String getNumber() {
        return number;
    }

    public Course getCourse() {
        return course;
    }

    public Staff[] getStaff() {
        return staff;
    }

}
