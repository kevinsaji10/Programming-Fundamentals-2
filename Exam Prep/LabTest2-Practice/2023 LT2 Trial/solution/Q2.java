import labtest.Employee;
import labtest.Meeting;
import labtest.TimeSlot;

import java.util.*;

public class Q2 {
    public static List<Employee> getCommonAttendees(Meeting m1, Meeting m2) {
        Set<Employee> attendees1 = new HashSet<>();
        attendees1.addAll(Arrays.asList(m1.getAttendees()));

        Set<Employee> attendees2 = new HashSet<>();
        attendees2.addAll(Arrays.asList(m2.getAttendees()));
        attendees1.retainAll(attendees2);

        List<Employee> result = new ArrayList<>(attendees1);
        result.sort(Comparator.comparing(Employee::getName));

        return result;
    }

    public static void main(String[] args) {
        int tcNum = 1;
        {
            List<Employee> result = getCommonAttendees(
                    new Meeting(
                            "M4",
                            new TimeSlot("12/12/2022 12:00", "12/12/2022 13:00"),
                            new Employee[]{
                                    new Employee("durian"),
                                    new Employee("apple"),
                                    new Employee("orange"),
                                    new Employee("pear")}),
                    new Meeting(
                            "M6",
                            new TimeSlot("13/12/2022 12:00", "13/12/2022 13:00"),
                            new Employee[]{
                                    new Employee("kiwi"),
                                    new Employee("banana"),
                                    new Employee("apple"),
                                    new Employee("coconut")
                            }
                    ));
            System.out.printf("Test %d%n", tcNum++);
            System.out.println("Expected:[apple]");
            System.out.println("Actual  :" + result);
            System.out.println();
        }
        {
            List<Employee> result = getCommonAttendees(
                    new Meeting(
                            "M1",
                            new TimeSlot("12/12/2022 12:00", "12/12/2022 13:00"),
                            new Employee[]{
                                    new Employee("persimmon"),
                                    new Employee("apple"),
                                    new Employee("durian"),
                                    new Employee("pear")
                            }),
                    new Meeting(
                            "M2",
                            new TimeSlot("13/12/2022 12:00", "13/12/2022 13:00"),
                            new Employee[]{
                                    new Employee("durian"),
                                    new Employee("pear"),
                                    new Employee("apple"),
                                    new Employee("durian")
                            }
                    ));
            System.out.printf("Test %d%n", tcNum++);
            System.out.println("Expected:[apple, durian, pear]");
            System.out.println("Actual  :" + result);
            System.out.println();
        }
        {
            List<Employee> result = getCommonAttendees(
                    new Meeting(
                            "M1",
                            new TimeSlot("12/12/2022 12:00", "12/12/2022 13:00"),
                            new Employee[]{
                                    new Employee("persimmon"),
                                    new Employee("durian"),
                                    new Employee("apple"),
                                    new Employee("pear")
                            }),
                    new Meeting(
                            "M2",
                            new TimeSlot("13/12/2022 12:00", "13/12/2022 13:00"),
                            new Employee[]{
                                    new Employee("guava"),
                                    new Employee("papaya"),
                                    new Employee("date"),
                                    new Employee("mango")
                            }
                    ));
            System.out.printf("Test %d%n", tcNum++);
            System.out.println("Expected:[]");
            System.out.println("Actual  :" + result);
            System.out.println();
        }

    }
}
