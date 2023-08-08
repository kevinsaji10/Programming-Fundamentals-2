/**
 * Name :
 * Email:
 */

import labtest.*;
import java.util.*;
public class Q2 {
    public static List<Employee> getCommonAttendees(Meeting meeting1, Meeting meeting2) {
        Employee[] e1 = meeting1.getAttendees();
        Employee[] e2 = meeting2.getAttendees();
        List<Employee> e1List = new ArrayList<>();
        List<Employee>e2List = new ArrayList<>();
        List<Employee> both = new ArrayList<>();
        for (Employee e : e1) {
                e1List.add(e);
        }
        for (Employee e : e2) {
                e2List.add(e);
        }
        for (int i = 0; i< e1List.size(); i++) {
                if (e2List.contains(e1List.get(i))) {
                        both.add(e1List.get(i));
                }
        }

        return both;
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