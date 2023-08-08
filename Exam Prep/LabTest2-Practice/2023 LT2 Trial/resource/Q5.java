

/**
 * Name :
 * Email:
 */
// find all the employees that went to the same meeting as each employee
// find the highest number of times an employee went to the same meeting as each employee
import java.util.*;
import labtest.*;
import labtest.epoch.*;
public class Q5 {
        public static int getHighestCount(List<String> list) {
                int highestCount = 0;
                for (String s : list) {
                        int counter = 0;
                        for (String x : list) {
                                if (s.equals(x)) {
                                        counter++;
                                }
                        }
                        if (counter > highestCount) {
                                highestCount = counter;
                        }
                }
                return highestCount;
        }
        public static int noOfTimes(String target, List<String> list) {
                int counter = 0;
                for (int i = 0; i<list.size(); i++) {
                        if (list.get(i) == target) {
                                counter++;
                        }
                }
                return counter;
        }
    public static Map<String, Set<String>> getTopMeetingCompanions(List<Meeting> meetings) {
        Map<String, Set<String>> map = new TreeMap<>();
        Map<String, List<String>> map1 = new TreeMap<>();
        for (Meeting m: meetings) {
                Employee[] empList = m.getAttendees();
                for (Employee e :empList) {
                        for (Employee x : empList) {
                                if (!e.equals(x)) {
                                       map1.putIfAbsent(e.getName(), new ArrayList<String>());
                                       map1.get(e.getName()).add(x.getName());
                                }
                        }
                }
        }
        // map1 contains a key which is employee name and a value which is a list of employees that have common meetings with them.
        // it contains duplicates. so the most number of duplicates is the highest number of times an employee went to a meeting with that employee
        int highestCount = 0;
        // find the highest count: which is the most number of meetings any employee has with one employee
        for (String s : map1.keySet()) {
                List<String> list = map1.get(s);
                if (highestCount < getHighestCount(list)) {
                        highestCount = getHighestCount(list);
                }
        }
        // if the employee has a highestCount number of meetings with another employee, add it to the return map
        for (String s : map1.keySet()) {
                List<String> list = map1.get(s);
                for (String str : list) {
                        if (noOfTimes(str, list) == highestCount) {
                                map.putIfAbsent(s, new TreeSet<String>());
                                map.get(s).add(str);
                        }
                }

        }
        return map;
    }

    public static void main(String[] args) {
        int tcNum = 1;
        {
            Map<String, Set<String>> result = getTopMeetingCompanions(List.of(
                    new Meeting(
                            "M1",
                            new TimeSlot("12/12/2022 12:00", "12/12/2022 13:00"),
                            new Employee[]{
                                    new Employee("B"),
                                    new Employee("C")
                            }
                    ),
                    new Meeting(
                            "M2",
                            new TimeSlot("13/12/2022 12:00", "13/12/2022 13:00"),
                            new Employee[]{
                                    new Employee("A"),
                                    new Employee("D")
                            }
                    ),
                    new Meeting(
                            "M3",
                            new TimeSlot("13/12/2022 12:00", "13/12/2022 13:00"),
                            new Employee[]{new Employee("B"), new Employee("C")}
                    ),
                    new Meeting(
                            "M4",
                            new TimeSlot("13/12/2022 12:00", "13/12/2022 13:00"),
                            new Employee[]{
                                    new Employee("A"),
                                    new Employee("B"),
                                    new Employee("C"),
                                    new Employee("D")
                            }
                    )));
            System.out.printf("Test %d%n", tcNum++);
            System.out.println("Expected:{B=[C], C=[B]}");
            System.out.println("Actual  :" + result);
            System.out.println();
        }
        {
            Map<String, Set<String>> result = getTopMeetingCompanions(List.of(
                    new Meeting(
                            "M1",
                            new TimeSlot("12/12/2022 12:00", "12/12/2022 13:00"),
                            new Employee[]{
                                    new Employee("C"),
                                    new Employee("D")
                            }
                    ),
                    new Meeting(
                            "M2",
                            new TimeSlot("13/12/2022 12:00", "13/12/2022 13:00"),
                            new Employee[]{
                                    new Employee("A"),
                                    new Employee("B")
                            }
                    ),
                    new Meeting(
                            "M3",
                            new TimeSlot("13/12/2022 12:00", "13/12/2022 13:00"),
                            new Employee[]{
                                    new Employee("B"),
                                    new Employee("D")
                            }
                    ),
                    new Meeting(
                            "M4",
                            new TimeSlot("13/12/2022 12:00", "13/12/2022 13:00"),
                            new Employee[]{
                                    new Employee("C"),
                                    new Employee("A"),
                                    new Employee("B"),
                                    new Employee("D")
                            }
                    )
            ));
            System.out.printf("Test %d%n", tcNum++);
            System.out.println("Expected:{A=[B], B=[A, D], C=[D], D=[B, C]}");
            System.out.println("Actual  :" + result);
            System.out.println();
        }
        {
            Map<String, Set<String>> result = getTopMeetingCompanions(List.of(
                    new Meeting(
                            "M1",
                            new TimeSlot("12/12/2022 12:00", "12/12/2022 13:00"),
                            new Employee[]{new Employee("C")})
            ));
            System.out.printf("Test %d%n", tcNum++);
            System.out.println("Expected:{}");
            System.out.println("Actual  :" + result);
            System.out.println();
        }
    }
}
