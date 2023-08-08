import java.util.*;

public class Employee extends Person {
    private ArrayList<Dependent> dependents;

    public Employee(String firstName, String lastName, int age){
        super(firstName, lastName, age);
    }

    public ArrayList<Dependent> getDependents() {
        return this.dependents;
    }

    public void setDependents(ArrayList<Dependent> dependents) {
        this.dependents = dependents;
    }
}