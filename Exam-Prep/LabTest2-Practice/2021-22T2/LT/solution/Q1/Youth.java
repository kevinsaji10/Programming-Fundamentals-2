import java.util.*;

public class Youth extends Person{
    
    private String school;

    public Youth(String name, int age, List<String> medicalCondition, String school, String vaccineCentre, String vaccine, char shotType) {
        super(name, age, medicalCondition, vaccineCentre, vaccine, shotType);
        this.school = school;
    }

    @Override
    public String toString() {
        return "Youth [" + super.toString() + ", school=" + school + "]";
    }
}
