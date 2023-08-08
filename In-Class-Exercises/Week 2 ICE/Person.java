// this is for Q7
public class Person {
    private String firstName;
    private String lastName;
    private int age;

    // constructor 1
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    // constructor 2
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = 0;
    }
    public int getAge()  {
        return age;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String toString() {
        return "Person [name = " + firstName + " " + lastName + ", age = " + age + "]";
    }
    
    
}