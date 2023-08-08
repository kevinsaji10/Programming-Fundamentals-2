import java.util.*;

public class Adult extends Person {
    private boolean isElderly;

    public Adult(String name, int age, List<String> medicalCondition, String vaccineCentre, String vaccine, char shotType,
            boolean isElderly) {
        super(name, age, medicalCondition, vaccineCentre, vaccine, shotType);
        this.isElderly = isElderly;
    }

    @Override
    public String toString() {
        return "Adult [" + super.toString() + ", isElderly=" + isElderly + "]";
    }
   
}
