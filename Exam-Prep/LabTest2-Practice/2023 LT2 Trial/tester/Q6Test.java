import labtest.TimeSlot;
import labtest.epoch.ScisDate;
import labtest.epoch.ScisTime;

import java.util.Arrays;
import java.util.List;

public class Q6Test {


    public static void main(String[] args) {
        int score = 0;
        {
            try {
                TimeSlot[] result = Q6.getFreeTimeSlots(
                        List.of(
                                new TimeSlot("12/12/2022 09:00", "12/12/2022 12:00"),
                                new TimeSlot("12/12/2022 20:00", "12/12/2022 21:00"),
                                new TimeSlot("12/12/2022 23:00", "12/12/2022 23:30")


                        ),
                        new ScisDate("12/12/2022"),
                        new ScisTime("10:00"),
                        new ScisTime("20:00")
                );
//                System.out.println(Arrays.toString(result));
                String ans = "[(12/12/2022 12:00, 12/12/2022 20:00)]";
                if (Arrays.toString(result).equals(ans)) {
                    score++;
                }
            } catch (Throwable e) {

            }
        }
        {
            try {
                TimeSlot[] result = Q6.getFreeTimeSlots(
                        List.of(
                                new TimeSlot("12/12/2022 09:00", "12/12/2022 12:00")
                        ),
                        new ScisDate("12/12/2022"),
                        new ScisTime("10:00"),
                        new ScisTime("20:00")
                );
//                System.out.println(Arrays.toString(result));
                String ans = "[(12/12/2022 12:00, 12/12/2022 20:00)]";
                if (Arrays.toString(result).equals(ans)) {
                    score++;
                }
            } catch (Throwable e) {

            }
        }
        {
            try {
                TimeSlot[] result = Q6.getFreeTimeSlots(
                        List.of(
                                new TimeSlot("12/12/2022 11:00", "12/12/2022 12:00"),
                                new TimeSlot("12/12/2022 12:00", "12/12/2022 13:00"),
                                new TimeSlot("12/12/2022 16:00", "12/12/2022 17:00"),
                                new TimeSlot("13/12/2022 16:00", "13/12/2022 17:00")

                        ),
                        new ScisDate("12/12/2022"),
                        new ScisTime("10:00"),
                        new ScisTime("20:00")
                );
//                System.out.println(Arrays.toString(result));
                if (Arrays.toString(result).equals("[(12/12/2022 10:00, 12/12/2022 11:00), (12/12/2022 13:00, 12/12/2022 16:00), (12/12/2022 17:00, 12/12/2022 20:00)]")) {
                    score++;
                }
            } catch (Throwable e) {

            }
        }


        {
            try {
                TimeSlot[] result = Q6.getFreeTimeSlots(
                        List.of(
                                new TimeSlot("12/12/2022 23:00", "13/12/2022 03:00"),
                                new TimeSlot("12/12/2022 12:00", "12/12/2022 13:00"),
                                new TimeSlot("12/12/2022 16:00", "12/12/2022 17:00"),
                                new TimeSlot("13/12/2022 16:00", "13/12/2022 17:00")

                        ),
                        new ScisDate("12/12/2022"),
                        new ScisTime("18:00"),
                        new ScisTime("23:00")
                );
//                System.out.println(Arrays.toString(result));
                String ans = "[(12/12/2022 18:00, 12/12/2022 23:00)]";
                if (Arrays.toString(result).equals(ans)) {
                    score++;
                }
            } catch (Throwable e) {
        e.printStackTrace();
            }
        }
        System.out.print("," + score);

    }
}
