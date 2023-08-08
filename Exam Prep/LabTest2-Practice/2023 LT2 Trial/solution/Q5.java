import labtest.Employee;
import labtest.Meeting;
import labtest.TimeSlot;

import java.util.*;

public class Q5 {
    public static void putInMap(Map<String,Integer> countMap, Employee e1, Employee e2) {
        int count = 0;
        String key = e1.getName() + "-" + e2.getName();
        if (countMap.containsKey(key))  {
            count = countMap.get(key);
        }
        countMap.put(key, count + 1);
    }
    public static Map<String,Set<String>> getTopMeetingCompanions(List<Meeting> meetingList) {
        Map<String, Integer> countMap = new HashMap<>();
        Set<Employee> all = new HashSet<>();
        for (Meeting m : meetingList) {
            List<Employee> employees = Arrays.asList(m.getAttendees());
            all.addAll(Arrays.asList(m.getAttendees()));

            for (int i = 0; i < employees.size(); i++) {
                Employee e1 = employees.get(i);
                for (int j = i + 1; j < employees.size(); j++) {
                    Employee e2 = employees.get(j);
                    putInMap(countMap, e1, e2);
                    putInMap(countMap, e2, e1);
                }
            }
        }
//        System.out.println(countMap);
        Optional<Integer> max = countMap.values().stream().max(Integer::compareTo);
        if (max.isEmpty()) {
            return new HashMap<>();
        }

        Map<String,Set<String>> buddies = new TreeMap<>();
        int target = max.get();
        for (String key : countMap.keySet()) {
            int value = countMap.get(key);
            if (value == target) {
                String[] kaki = key.split("-");
                buddies.putIfAbsent(kaki[0], new TreeSet<>());
                buddies.putIfAbsent(kaki[1], new TreeSet<>());
                buddies.get(kaki[0]).add(kaki[1]);
                buddies.get(kaki[0]).add(kaki[1]);
            }
        }
        return buddies;
    }

    public static void main(String[] args) {
        int tcNum = 1;
        {
            Map<String, Set<String>> result = getTopMeetingCompanions(List.of(
                    new Meeting(
                            "M1",
                            new TimeSlot("12/12/2022 12:00", "12/12/2022 13:00"),
                            new Employee[]{new Employee("B"), new Employee("C")}),
                    new Meeting(
                            "M2",
                            new TimeSlot("13/12/2022 12:00", "13/12/2022 13:00"),
                            new Employee[]{new Employee("A"), new Employee("D")}
                    ),
                    new Meeting(
                            "M3",
                            new TimeSlot("13/12/2022 12:00", "13/12/2022 13:00"),
                            new Employee[]{new Employee("B"), new Employee("C")}
                    ),
                    new Meeting(
                            "M4",
                            new TimeSlot("13/12/2022 12:00", "13/12/2022 13:00"),
                            new Employee[]{new Employee("A"), new Employee("B"),
                                    new Employee("C"),new Employee("D")}
                    )
                    ));
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
                            new Employee[]{new Employee("C"), new Employee("D")}),
                    new Meeting(
                            "M2",
                            new TimeSlot("13/12/2022 12:00", "13/12/2022 13:00"),
                            new Employee[]{new Employee("A"), new Employee("B")}
                    ),
                    new Meeting(
                            "M3",
                            new TimeSlot("13/12/2022 12:00", "13/12/2022 13:00"),
                            new Employee[]{new Employee("B"), new Employee("D")}
                    ),
                    new Meeting(
                            "M4",
                            new TimeSlot("13/12/2022 12:00", "13/12/2022 13:00"),
                            new Employee[]{new Employee("A"), new Employee("B"),
                                    new Employee("C"),new Employee("D")}
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
