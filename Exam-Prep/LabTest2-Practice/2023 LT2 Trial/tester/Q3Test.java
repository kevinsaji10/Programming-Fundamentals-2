import labtest.Employee;
import labtest.Meeting;
import labtest.TimeSlot;

import java.util.*;

public class Q3Test {
    public static void main(String[] args) {
        int score = 0;
        {
            try {
                Map<String, Set<String>> result = Q3.getMeetingIdsOfIndividuals(
                        new Meeting[] {
                                new Meeting(
                                        "M1",
                                        new TimeSlot("12/12/2022 12:00", "12/12/2022 13:00"),
                                        new Employee[] { new Employee("E1"), new Employee("E2"),
                                                new Employee("E3") }) });
                result = new TreeMap<>(result);

                if (result.toString().equals("{E1=[M1], E2=[M1], E3=[M1]}")) {
                    score++;
                }
            } catch (Throwable e) {

            }
        }
        {
            try {
                Map<String, Set<String>> result = Q3.getMeetingIdsOfIndividuals(
                        new Meeting[] {
                                new Meeting(
                                        "M1",
                                        new TimeSlot("12/12/2022 12:00", "12/12/2022 13:00"),
                                        new Employee[] { new Employee("E1"), new Employee("E2"), new Employee("E3") }),
                                new Meeting(
                                        "M2",
                                        new TimeSlot("13/12/2022 12:00", "13/12/2022 13:00"),
                                        new Employee[] { new Employee("E2") })
                        });
                // System.out.println(result);
                result = new TreeMap<>(result);

                if (result.toString().equals("{E1=[M1], E2=[M1, M2], E3=[M1]}")) {
                    score++;
                }
            } catch (Throwable e) {

            }
        }
        {
            try {
                Map<String, Set<String>> result = Q3.getMeetingIdsOfIndividuals(
                        new Meeting[] {
                                new Meeting(
                                        "M1",
                                        new TimeSlot("12/12/2022 12:00", "12/12/2022 13:00"),
                                        new Employee[] { new Employee("E1"), new Employee("E2"), new Employee("E3") }),
                                new Meeting(
                                        "M2",
                                        new TimeSlot("13/12/2022 12:00", "13/12/2022 13:00"),
                                        new Employee[] { new Employee("E2"), new Employee("E4") })
                        });
                // System.out.println(result);
                result = new TreeMap<>(result);

                if (result.toString().equals("{E1=[M1], E2=[M1, M2], E3=[M1], E4=[M2]}")) {
                    score++;
                }
            } catch (Throwable e) {

            }
        }
        {
            try {
                Map<String, Set<String>> result = Q3.getMeetingIdsOfIndividuals(
                        new Meeting[] {
                                new Meeting(
                                        "M1",
                                        new TimeSlot("12/12/2022 12:00", "12/12/2022 13:00"),
                                        new Employee[] { new Employee("E2"), new Employee("E1") }),
                                new Meeting(
                                        "M2",
                                        new TimeSlot("13/12/2022 12:00", "13/12/2022 13:00"),
                                        new Employee[] { new Employee("E2"), new Employee("E4"), new Employee("E1") }),
                                new Meeting(
                                        "M3",
                                        new TimeSlot("14/12/2022 12:00", "14/12/2022 13:00"),
                                        new Employee[] { new Employee("E5"), new Employee("E1") }),

                        });
                // System.out.println(result);
                result = new TreeMap<>(result);

                if (result.toString().equals("{E1=[M1, M2, M3], E2=[M1, M2], E4=[M2], E5=[M3]}")) {
                    score++;
                }
            } catch (Throwable e) {

            }
        }

        System.out.print("," + score);
    }
}
