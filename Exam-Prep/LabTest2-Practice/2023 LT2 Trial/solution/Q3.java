import labtest.Employee;
import labtest.Meeting;
import labtest.TimeSlot;

import java.util.*;

public class Q3 {
    public static Map<String, Set<String>> getMeetingIdsOfIndividuals(Meeting[] meetings) {
        Map<String, Set<String>> result = new TreeMap<>();
        for (Meeting m : meetings) {
            Employee[] attendees = m.getAttendees();
            for (Employee one : attendees) {
                String key = one.getName();
                Set<String> meetingList = result.computeIfAbsent(key, k -> new TreeSet<>());
                meetingList.add(m.getId());
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int tcNum = 1;
        {
            Map<String, Set<String>> result = getMeetingIdsOfIndividuals(
                    new Meeting[]{
                            new Meeting(
                                    "M12",
                                    new TimeSlot("12/12/2022 12:00", "12/12/2022 13:00"),
                                    new Employee[]{new Employee("berry"), new Employee("apple"), new Employee("cherry")})});
            System.out.printf("Test %d%n", tcNum++);
            System.out.println("Expected:{apple=[M12], berry=[M12], cherry=[M12]}");
            System.out.println("Actual  :" + result);
            System.out.println();
        }
        {
            Map<String, Set<String>> result = getMeetingIdsOfIndividuals(
                    new Meeting[]{
                            new Meeting(
                                    "M3",
                                    new TimeSlot("12/12/2022 12:00", "12/12/2022 13:00"),
                                    new Employee[]{ new Employee("orange"), new Employee("durian")}),

                            new Meeting(
                                    "M1",
                                    new TimeSlot("12/12/2022 12:00", "12/12/2022 13:00"),
                                    new Employee[]{new Employee("durian"), new Employee("apple"), new Employee("orange"), new Employee("pear")}),
                            new Meeting(
                                    "M2",
                                    new TimeSlot("13/12/2022 12:00", "13/12/2022 13:00"),
                                    new Employee[]{new Employee("durian"), new Employee("pear"), new Employee("apple")}
                            )});
            System.out.printf("Test %d%n", tcNum++);
            System.out.println("Expected:{apple=[M1, M2], durian=[M1, M2, M3], orange=[M1, M3], pear=[M1, M2]}");
            System.out.println("Actual  :" + result);
            System.out.println();
        }
    }
}
