/*
 *
 * Name:
 */
import java.util.*;
public class Person implements Comparable<Person> {
   public String name;
   public int age;
   public List<String> medicalCondition;
   public String vaccineCentre;
   public String vaccine;
   public char shotType;

    public static int earlier(char c1, char c2) {
        if (c1 == 'F' && (c2 == 'S' || c2 == 'B')) {
            return -1;
        } else if (c1 == 'S' && c2 =='B') {
            return-1;
        } else if (c1 == c2) {
            return 0;
        } else {
            return 1;
        }
    }
    public int compareTo(Person anotherPerson) {
        if (earlier(this.shotType, anotherPerson.shotType) == -1) {
            return -1;
        } else if (earlier(this.shotType, anotherPerson.shotType) == 1) {
            return 1;
        } else {
            int med1 = this.medicalCondition.size();
            int med2 = anotherPerson.medicalCondition.size();
            if (med1 > med2) {
                return -1;
            } else if (med1 == med2) {
                return 0;
            } else {
                return 1;
            }
        }
    }
   
   public Person(String name, int age, List<String> medicalCondition, String vaccineCentre, String vaccine, char shotType) {
    this.name = name;
    this.age = age;
    this.medicalCondition = medicalCondition;
    this.vaccineCentre = vaccineCentre;
    this.vaccine = vaccine;
    this.shotType = shotType;

    }
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", medicalCondition=" + medicalCondition + ", vaccineCentre="
                + vaccineCentre + ", vaccine=" + vaccine + ", shotType=" + shotType + "]";
    }
    

   
   
}