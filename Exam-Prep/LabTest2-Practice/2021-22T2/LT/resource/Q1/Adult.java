/*
 *
 * Name:
 */
import java.util.*;
public class Adult extends Person{
    private boolean isElderly;

    public Adult (String name, int age, List<String> medicalCondition, String vaccineCentre, String vaccine, char shotType, boolean isElderly) {
        super(name, age, medicalCondition, vaccineCentre, vaccine, shotType);
        this.isElderly = isElderly;
   }
   public String toString() {
    return "Adult [name=" + name + ", age=" + age + ", medicalCondition=" + medicalCondition + ", vaccineCentre="
            + vaccineCentre + ", vaccine=" + vaccine + ", shotType=" + shotType + ", isElderly=" + isElderly + "]";
   }
}