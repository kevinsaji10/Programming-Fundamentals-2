import java.util.*;

public class Person implements Comparable<Person>{
    private String name;
    private int age;
    private List<String> medicalCondition;
    private String vaccineCentre;
    private String vaccine;
    private char shotType;

    public Person(String name, int age,  List<String> medicalCondition, String vaccineCentre, String vaccine, char shotType){
        this.name = name;
        this.age = age;
        this.medicalCondition = medicalCondition;
        this.vaccineCentre = vaccineCentre;
        this.vaccine = vaccine;
        this.shotType = shotType;
    }

    @Override
    public String toString() {
        return  "name=" + name + ", age=" + age + ", medicalCondition=" + medicalCondition 
                + ", shotType=" + shotType;
    }

    public int compareTo(Person anotherPerson){
        int shotType1 = shotType;
        int shotType2 = anotherPerson.shotType;
        
        if (shotType == anotherPerson.shotType){
            int numMedicalCondition1 = 0;
            int numMedicalCondition2 = 0;
            if (medicalCondition != null){
                numMedicalCondition1 = medicalCondition.size();
            }
            if (anotherPerson.medicalCondition != null){
                numMedicalCondition2 = anotherPerson.medicalCondition.size();
            }
            
            return Integer.compare(numMedicalCondition2, numMedicalCondition1);
        } 
        
        if (shotType1 == 'S'){
            shotType1 = 'F' + 1;
        } else if (shotType1 == 'B'){
            shotType1 = 'S' + 1;
        }
        if (shotType2 == 'S'){
            shotType2 = 'F' + 1;
        } else if (shotType2 == 'B'){
            shotType2 = 'S' + 1;
        }

        return Integer.compare(shotType1, shotType2);
    }
}