/*
 *
 * Name:
 */
package school.entity;
public class Teacher extends Person {
    private String empNo;

    public Teacher(String name, String empNo){
        super(name);
        this.empNo = empNo;
    }
}
