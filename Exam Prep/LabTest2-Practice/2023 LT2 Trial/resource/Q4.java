/**
 * Name :
 * Email:
 */
//
import java.util.*;
import labtest.*;
import labtest.epoch.*;
public class Q4 {
    public static List<Conflict> getConflicts(List<Meeting> scheduled) {
        List<Conflict> list = new ArrayList<>();
        Set<Conflict> set = new TreeSet<>();
        for (int i = 0; i<scheduled.size(); i++) {
                for (int j = i; j<scheduled.size(); j++) {
                        if(i != j) {
                                ScisDateTime s1 = scheduled.get(i).getSlot().getStart();
                                ScisDateTime e1 = scheduled.get(i).getSlot().getEnd();

                                ScisDateTime s2 = scheduled.get(j).getSlot().getStart();
                                ScisDateTime e2 = scheduled.get(j).getSlot().getEnd();
                                if (s1.getDate().equals(s2.getDate()) && e1.getDate().equals(e2.getDate())) {
                                        if (s1.isAfter(s2) && e1.isAfter(e2) && s1.isBefore(e1) || s1.isAfter(s2) && e1.isBefore(e2) || s1.isBefore(s2) && e1.isAfter(e2) || s1.isBefore(s2) && e1.isBefore(e2) && s2.isBefore(e1) || s1.equals(s2) || e1.equals(e2)) {
                                                Conflict c = new Conflict(scheduled.get(i), scheduled.get(j));
                                                if (!list.contains(c)) {
                                                        list.add(c);
                                                }
                                                
                                        }
                                }
                        }
                }
        }
        
        return list;
    }

    public static void main(String[] args) {
        int tcNum = 1;
        {
            List<Conflict> result = getConflicts(List.of(
                    new Meeting(
                            "M1",
                            new TimeSlot("12/12/2022 12:00", "12/12/2022 13:00")),
                    new Meeting(
                            "M2",
                            new TimeSlot("12/12/2022 12:30", "12/12/2022 13:30"))
            ));
            System.out.printf("Test %d%n", tcNum++);
            System.out.println("Expected:[(M1, M2)]");
            // sort your return value and print it
            if (result != null) {
                result.sort(Comparator.comparing((Conflict a) -> a.getMeeting1().getId())
                        .thenComparing(a -> a.getMeeting1().getId()));
            }
            System.out.println("Actual  :" + result);
            System.out.println();
        }
        {
            List<Conflict> result = getConflicts(List.of(
                    new Meeting(
                            "M1",
                            new TimeSlot("12/12/2022 12:00", "12/12/2022 13:00")),
                    new Meeting(
                            "M2",
                            new TimeSlot("12/12/2022 12:30", "12/12/2022 13:30")),
                    new Meeting(
                            "M3",
                            new TimeSlot("13/12/2022 11:30", "13/12/2022 12:30")),
                    new Meeting(
                            "M4",
                            new TimeSlot("12/12/2022 12:30", "12/12/2022 12:45"))
            ));
            System.out.printf("Test %d%n", tcNum++);
            System.out.println("Expected:[(M1, M2), (M1, M4), (M2, M4)]");
            // sort your return value and print it
            if (result != null) {
                result.sort(Comparator.comparing((Conflict a) -> a.getMeeting1().getId())
                        .thenComparing(a -> a.getMeeting1().getId()));
            }
            System.out.println("Actual  :" + result);
            System.out.println();
        }


    }
}
