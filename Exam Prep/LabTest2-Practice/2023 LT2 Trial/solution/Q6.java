import labtest.TimeSlot;
import labtest.epoch.ScisDate;
import labtest.epoch.ScisTime;

import java.util.*;

public class Q6 {

    public static boolean overlaps(TimeSlot ts1, TimeSlot ts2) {
        return ts1.getStart().isBefore(ts2.getEnd())
                && ts2.getStart().isBefore(ts1.getEnd());
    }

    public static TimeSlot[] getFreeTimeSlots(List<TimeSlot> slots, ScisDate target, ScisTime start, ScisTime end) {
        if (slots.isEmpty()) {
            return new TimeSlot[]{new TimeSlot(target.toDateTime(start), target.toDateTime(end))};
        }
        List<TimeSlot> result = new ArrayList<>(slots);
        Collections.sort(result, Comparator.comparing(TimeSlot::getStart));
        result.removeIf(ts -> !ts.getStart().getDate().equals(target) && !ts.getEnd().getDate().equals(target));
        TimeSlot workingHours = new TimeSlot(target.toDateTime(start), target.toDateTime(end));
        result.removeIf(ts -> !overlaps(workingHours, ts));

        if (result.isEmpty()) {
            return new TimeSlot[]{ new TimeSlot(target.toDateTime(start), target.toDateTime(end))};
        }

        List<TimeSlot> freeSlots = new ArrayList<>();
            TimeSlot first = result.get(0);
            if (first.getStart().isAfter(target.toDateTime(start))) {
                freeSlots.add(new TimeSlot(target.toDateTime(start), first.getStart()));
            }


        for (int i = 1; i < result.size(); i++) {
            TimeSlot earlier = result.get(i - 1);
            TimeSlot later = result.get(i);
            if (!earlier.getEnd().equals(later.getStart())) {
                freeSlots.add(new TimeSlot(earlier.getEnd(), later.getStart()));
            }
        }

        TimeSlot last = result.get(result.size() - 1);
        if (last.getEnd().isBefore(target.toDateTime(end))) {
            freeSlots.add(new TimeSlot(last.getEnd(), target.toDateTime(end)));
        }
//        if (freeSlots.isEmpty()) {
//            freeSlots.add(new Timeslot(target.toDateTime(start), target.toDateTime(end)));
//        } else {
//            System.out.println(result.size());
//            Timeslot last = result.get(result.size() - 1);
//            labtest.epoch.ScisDateTime endTime = last.getEnd().getDate().toDateTime(end);
//            if (last.getEnd().isBefore(endTime)) {
//                freeSlots.add(new Timeslot(last.getEnd(), endTime));
//            }
//        }
//
//        System.out.println("free slotsXX:" + freeSlots);
//        List<Timeslot> toReturn = new ArrayList<>();
//        for (Timeslot slot : freeSlots) {
//            labtest.epoch.ScisDate date = slot.getStart().getDate();
//            Timeslot workingHours = new Timeslot(date.toDateTime(start), date.toDateTime(end));
//            if (overlaps(slot, workingHours)) {
//                labtest.epoch.ScisDateTime newStart = slot.getStart();
//                if (newStart.isBefore(workingHours.getStart())) {
//                    newStart = workingHours.getStart();
//                }
//                labtest.epoch.ScisDateTime newEnd = slot.getEnd();
//                if (newEnd.isAfter(workingHours.getEnd())) {
//                    newEnd = workingHours.getEnd();
//                }
//                toReturn.add(new Timeslot(newStart, newEnd));
//            }
//        }
//        Timeslot lastBusy = slots.get(toReturn.size() - 1);
//        if (lastBusy.getEnd().isBefore(lastBusy.getStart().getDate().toDateTime(end))) {
//            toReturn.add(new Timeslot(lastBusy.getEnd(), lastBusy.getStart().getDate().toDateTime(end)));
//        }
//        return toReturn.toArray(new Timeslot[toReturn.size()]);
        return freeSlots.toArray(new TimeSlot[freeSlots.size()]);
    }
    public static void main(String[] args) {
        int tcNum = 1;
        {
            TimeSlot[] result = getFreeTimeSlots(
                    List.of(
                            new TimeSlot("12/12/2022 09:00", "12/12/2022 11:00"),
                            new TimeSlot("12/12/2022 11:00", "12/12/2022 13:39"),
                            new TimeSlot("12/12/2022 17:00", "12/12/2022 17:30")
                    ),
                    new ScisDate("12/12/2022"),
                    new ScisTime("09:00"),
                    new ScisTime("18:00")
            );
            System.out.printf("Test %d%n", tcNum++);
            System.out.println("Expected:[(12/12/2022 13:39, 12/12/2022 17:00), (12/12/2022 17:30, 12/12/2022 18:00)]");
            System.out.println("Actual  :" + Arrays.toString(result));
            System.out.println();
        }
        {
            TimeSlot[] result = getFreeTimeSlots(
                    List.of(
                    ),
                    new ScisDate("12/12/2022"),
                    new ScisTime("09:00"),
                    new ScisTime("18:00")
            );
            System.out.printf("Test %d%n", tcNum++);
            System.out.println("Expected:[(12/12/2022 09:00, 12/12/2022 18:00)]");
            System.out.println("Actual  :" + Arrays.toString(result));
            System.out.println();
        }
        {
            TimeSlot[] result = getFreeTimeSlots(
                    List.of(
                            new TimeSlot("12/12/2022 05:00", "12/12/2022 07:00"),
                            new TimeSlot("12/12/2022 18:30", "12/12/2022 19:30"),
                            new TimeSlot("12/12/2022 05:00", "12/12/2022 07:00"),
                            new TimeSlot("12/12/2022 07:30", "12/12/2022 08:30"),
                            new TimeSlot("12/12/2022 11:00", "12/12/2022 13:00"),
                            new TimeSlot("12/12/2022 17:00", "12/12/2022 17:30"),
                            new TimeSlot("14/12/2022 05:00", "12/12/2022 07:00")
                    ),
                    new ScisDate("12/12/2022"),
                    new ScisTime("10:00"),
                    new ScisTime("18:00")
            );
            System.out.printf("Test %d%n", tcNum++);
            System.out.println("Expected:[(12/12/2022 10:00, 12/12/2022 11:00), (12/12/2022 13:00, 12/12/2022 17:00), (12/12/2022 17:30, 12/12/2022 18:00)]");
            System.out.println("Actual  :" + Arrays.toString(result));
            System.out.println();
        }
    }
}
