/*
 *
 * Name:
 */
import java.util.*;
public class Person implements Comparator<Person> {
   public String name;
   public int age;
   public List<String> medicalCondition;
   public String vaccineCentre;
   public String vaccine;
   public char shotType;


   
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