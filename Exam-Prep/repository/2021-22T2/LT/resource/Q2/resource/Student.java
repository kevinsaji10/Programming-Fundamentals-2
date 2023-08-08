/*
 *
 * Name:
 */

public class Student extends Person{
    private String StudentID;

    public Student(String name, String StudentID){
        super(name);
        this.StudentID = StudentID;
    }

    public String getStudentID() {
        return StudentID;
    }

    public void setStudentID(String studentID) {
        StudentID = studentID;
    }

}
