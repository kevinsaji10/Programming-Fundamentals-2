import java.util.*;

public class Person {
    private String name;
    private int age;

    public Person (String name, int age) {
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public static void main(String[] args) {
        Person p1 = new Person("kevin", 23);
        Person p2 = new Person("bob", 44);
        Person p3 = new Person("daniel", 43);
        Person p4 = new Person("robert", 2);
        Person p5 = new Person("alice", 59);
        Person p6 = new Person("alice", 97);
        List<Person> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);
        list.add(p6);
        Collections.sort(list, Comparator.comparing(Person::getName, Comparator.reverseOrder()).thenComparing(Person::getAge));
        System.out.println(list);
    }
    
}
