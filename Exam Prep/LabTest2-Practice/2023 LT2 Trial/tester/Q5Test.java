import labtest.Employee;
import labtest.Meeting;
import labtest.TimeSlot;

import java.util.*;

public class Q5Test {
    public static void main(String[] args) {
        int score = 0;
        {
            try {
                Map<String, Set<String>> result = Q5.getTopMeetingCompanions(List.of(
                        new Meeting(
                                "M11",
                                new TimeSlot("12/12/2022 13:00", "12/12/2022 14:00"),
                                new Employee[]{new Employee("B"), new Employee("C")}),
                        new Meeting(
                                "M12",
                                new TimeSlot("13/12/2022 13:30", "13/12/2022 14:00"),
                                new Employee[]{new Employee("A"), new Employee("D")}
                        )
                ));
//            System.out.println("Expected:{B=[C], C=[B]}");
                result = new TreeMap<>(result);
                if (result.toString().equals("{A=[D], B=[C], C=[B], D=[A]}")) {
                    score++;
                }
            } catch (Throwable e) {

            }
        }
        {
            try {
                Map<String, Set<String>> result = Q5.getTopMeetingCompanions(List.of(
                        new Meeting(
                                "M11",
                                new TimeSlot("12/12/2022 13:00", "12/12/2022 14:00"),
                                new Employee[]{new Employee("B")}),
                        new Meeting(
                                "M12",
                                new TimeSlot("13/12/2022 13:30", "13/12/2022 14:00"),
                                new Employee[]{new Employee("A"), new Employee("B")}
                        )
                ));
//            System.out.println(result);
                result = new TreeMap<>(result);
                if (result.toString().equals("{A=[B], B=[A]}")) {
                    score++;
                }
            } catch (Throwable e) {

            }
        }
        {
            try {
                Map<String, Set<String>> result = Q5.getTopMeetingCompanions(List.of(
                        new Meeting(
                                "M11",
                                new TimeSlot("12/12/2022 13:00", "12/12/2022 14:00"),
                                new Employee[]{new Employee("B")}),
                        new Meeting(
                                "M12",
                                new TimeSlot("13/12/2022 13:30", "13/12/2022 14:00"),
                                new Employee[]{new Employee("A"), new Employee("B")}
                        ),
                        new Meeting(
                                "M13",
                                new TimeSlot("13/12/2022 13:30", "13/12/2022 14:00"),
                                new Employee[]{new Employee("C"), new Employee("A")}
                        )
                ));
//            System.out.println(result);
                if (result.toString().equals("{A=[B, C], B=[A], C=[A]}")) {
                    score++;
                }
            } catch (Throwable e) {

            }
        }
        {
            try {
                Map<String, Set<String>> result = Q5.getTopMeetingCompanions(List.of(
                        new Meeting(
                                "M11",
                                new TimeSlot("12/12/2022 13:00", "12/12/2022 14:00"),
                                new Employee[]{new Employee("B"), new Employee("A")}),
                        new Meeting(
                                "M12",
                                new TimeSlot("13/12/2022 13:30", "13/12/2022 14:00"),
                                new Employee[]{new Employee("A"), new Employee("C")}
                        ),
                        new Meeting(
                                "M13",
                                new TimeSlot("14/12/2022 13:30", "14/12/2022 14:00"),
                                new Employee[]{new Employee("C"), new Employee("B")}
                        ),
                        new Meeting(
                                "M14",
                                new TimeSlot("15/12/2022 13:30", "15/12/2022 14:00"),
                                new Employee[]{new Employee("C"), new Employee("A")}
                        ),
                        new Meeting(
                                "M15",
                                new TimeSlot("16/12/2022 13:30", "16/12/2022 14:00"),
                                new Employee[]{new Employee("C"), new Employee("B"),new Employee("A"), new Employee("D")}
                        )
                ));
//            System.out.println(result);
                result = new TreeMap<>(result);

                if (result.toString().equals("{A=[C], C=[A]}")) {
                    score++;
                }
            } catch (Throwable e) {

            }
        }
        System.out.print(","+ score);
    }
}
