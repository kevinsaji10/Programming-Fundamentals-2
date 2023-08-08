package labtest;

import java.util.Objects;

/**
 * Abstraction of an employee, storing the name.
 */
public class Employee {
    private String name;
    /**
     * constructor
     * @param name the name
     */
    public Employee(String name) {
        this.name = name;
    }

    /**
     * Gets the name.
     * @return the name.
     */
    public String getName() {
        return name;
    }


    /**
     * Compares two Employees for equality. The result is true if and only if the argument is not null
     * and is a Employee object that represents the same employee.
     * @param o an object.
     * @return true if o is an Employee
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Employee)) {
            return false;
        }
        Employee another = (Employee) o;
        return Objects.equals(name, another.name);
    }

    /**
     * Gets the hashcode
     * @return the hashcode
     */
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    /**
     * Textual representation
     * @return a string containing the employee's name
     */
    @Override
    public String toString() {
        return name;
    }
}
