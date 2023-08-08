/**
 * Name :
 * Email:
 */
public class Q6 {


    public static TimeSlot[] getFreeTimeSlots(List<TimeSlot> busySlots, 
            ScisDate targetDate, ScisTime workStart, ScisTime workEnd) {
            
        return null;
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
