import labtest.Employee;
import labtest.Meeting;
import labtest.TimeSlot;

import java.util.*;

public class Q2Test {

    public static void main(String[] args) {
        int score = 0;
        {
            try {
                List<Employee> result = Q2.getCommonAttendees(
                        new Meeting(
                                "M4",
                                new TimeSlot("12/12/2022 12:00", "12/12/2022 13:00"),
                                new Employee[]{
                                        new Employee("durian"),
                                        new Employee("qwerty"),
                                        new Employee("orange"),
                                        new Employee("pear")}),
                        new Meeting(
                                "M6",
                                new TimeSlot("13/12/2022 12:00", "13/12/2022 13:00"),
                                new Employee[]{
                                        new Employee("kiwi"),
                                        new Employee("banana"),
                                        new Employee("qwerty"),
                                        new Employee("coconut")
                                }
                        ));
                if (result.toString().equals("[qwerty]")) {
                    score += 1;
                }
            }catch (Throwable e) {

            }

        }
        {
            try {
                List<Employee> result = Q2.getCommonAttendees(
                        new Meeting(
                                "M1",
                                new TimeSlot("12/12/2022 12:00", "12/12/2022 13:00"),
                                new Employee[]{
                                        new Employee("persimmon"),
                                        new Employee("P1"),
                                        new Employee("P2"),
                                        new Employee("P3")
                                }),
                        new Meeting(
                                "M2",
                                new TimeSlot("13/12/2022 12:00", "13/12/2022 13:00"),
                                new Employee[]{
                                        new Employee("P2"),
                                        new Employee("pear"),
                                        new Employee("P1"),
                                        new Employee("P3")
                                }
                        ));
                if (result.toString().equals("[P1, P2, P3]")) {
                    score += 1;
                }
            }catch (Throwable e) {

            }
        }
        {
            try {
                List<Employee> result = Q2.getCommonAttendees(
                        new Meeting(
                                "M1",
                                new TimeSlot("12/12/2022 12:00", "12/12/2022 13:00"),
                                new Employee[]{
                                        new Employee("A"),
                                        new Employee("B"),
                                        new Employee("C"),
                                        new Employee("D")
                                }),
                        new Meeting(
                                "M2",
                                new TimeSlot("13/12/2022 12:00", "13/12/2022 13:00"),
                                new Employee[]{
                                        new Employee("E"),
                                        new Employee("F"),
                                        new Employee("G"),
                                        new Employee("H")
                                }
                        ));
                if (result.toString().equals("[]")) {
                    score += 1;
                }
            } catch (Throwable e) {

            }
        }

        Map<Integer, Double> map = new HashMap<>();
        map.put(0, 0.0);
        map.put(1, 2.5);
        map.put(2, 3.0);
        map.put(3, 4.0);
        System.out.print(","+map.get(score));
    }
}
