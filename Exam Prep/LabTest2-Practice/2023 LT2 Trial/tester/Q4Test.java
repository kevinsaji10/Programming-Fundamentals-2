import labtest.Conflict;
import labtest.Meeting;
import labtest.TimeSlot;
import labtest.epoch.ScisDateTime;

import java.util.*;

public class Q4Test {


    public static void main(String[] args) {
        int score = 0;
        {
            try {
                List<Conflict> result = Q4.getConflicts(List.of(
                        new Meeting(
                                "M11",
                                new TimeSlot("12/12/2022 13:00", "12/12/2022 14:00")),
                        new Meeting(
                                "M12",
                                new TimeSlot("12/12/2022 13:45", "12/12/2022 14:00"))
                ));
                result.sort(Comparator.comparing((Conflict a) -> a.getMeeting1().getId()).thenComparing(a -> a.getMeeting1().getId()));
//                System.out.println("Actual  :" + result);
                if (result.toString().equals("[(M11, M12)]")) {
                    score++;
                }
                // System.out.println();
            } catch (Throwable e) {

            }
        }
        {
            try {
                List<Conflict> result = Q4.getConflicts(List.of(
                        new Meeting(
                                "M11",
                                new TimeSlot("12/12/2022 15:30", "12/12/2022 17:00")),
                        new Meeting(
                                "M12",
                                new TimeSlot("12/12/2022 13:45", "12/12/2022 15:45"))
                ));
                result.sort(Comparator.comparing((Conflict a) -> a.getMeeting1().getId()).thenComparing(a -> a.getMeeting1().getId()));
//                System.out.println("Actual  :" + result);
                if (result.toString().equals("[(M11, M12)]")) {
                    score++;
                }
                // System.out.println();
            } catch (Throwable e) {

            }
        }
        {
            try {
                List<Conflict> result = Q4.getConflicts(List.of(
                        new Meeting(
                                "M11",
                                new TimeSlot("12/12/2022 11:00", "12/12/2022 14:00")),
                        new Meeting(
                                "M12",
                                new TimeSlot("12/12/2022 10:00", "12/12/2022 11:30")),
                        new Meeting(
                                "M13",
                                new TimeSlot("12/12/2022 11:30", "12/12/2022 12:30")),
                        new Meeting(
                                "M14",
                                new TimeSlot("12/12/2022 13:35", "12/12/2022 14:40"))
                ));
                result.sort(Comparator.comparing((Conflict a) -> a.getMeeting1().getId()).thenComparing(a -> a.getMeeting1().getId()));
//                System.out.println("Actual  :" + result);
                if (result.toString().equals("[(M11, M12), (M11, M13), (M11, M14)]")) {
                    score++;
                }
                // System.out.println();
            } catch (Throwable e) {

            }
        }
        {
            try {
                List<Conflict> result = Q4.getConflicts(List.of(
                        new Meeting(
                                "M13",
                                new TimeSlot("12/12/2022 11:30", "12/12/2022 12:30")),
                        new Meeting(
                                "M14",
                                new TimeSlot("13/12/2022 13:35", "13/12/2022 14:40"))
                ));
                result.sort(Comparator.comparing((Conflict a) -> a.getMeeting1().getId()).thenComparing(a -> a.getMeeting1().getId()));
//                System.out.println("Actual  :" + result);
                if (result.toString().equals("[]")) {
                    score++;
                }
                // System.out.println();
            } catch (Throwable e) {

            }
        }

        System.out.print(","+ score);
    }
}
