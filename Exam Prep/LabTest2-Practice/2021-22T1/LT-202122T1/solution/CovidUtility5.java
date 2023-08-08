import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CovidUtility5 {

    public static int getPeak(List<Entry> entries) {
        List<Entry> enterTimings = new ArrayList<>(entries);
        List<Entry> exitTimings = new ArrayList<>(entries);
        enterTimings.sort(Comparator.comparing(Entry::getStartDateTime));
        exitTimings.sort(Comparator.comparing(Entry::getEndDateTime));

        int enterIdx = 0;
        int exitIdx = 0;
        int count = 0;
        int max = 0;
        while (enterIdx < enterTimings.size() && exitIdx < exitTimings.size()) {
            SimpleDateTime enterDateTime = enterTimings.get(enterIdx).getStartDateTime();
            SimpleDateTime exitDateTime = exitTimings.get(exitIdx).getEndDateTime();

            if (enterDateTime.isBefore(exitDateTime) ) {
                count++;
                enterIdx++;
            } else if (enterDateTime.isAfter(exitDateTime)) {
                count--;
                exitIdx++;
            } else {
                enterIdx++;
                exitIdx++;
            }

            if (count > max) {
                max = count;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        {
            List<Entry> entries = List.of(
                    new Entry("durian",
                            new SimpleDateTime(2021, 10, 3, 9, 15),
                            new SimpleDateTime(2021, 10, 3, 9, 40)),
                    new Entry("pear",
                            new SimpleDateTime(2021, 10, 3, 9, 0),
                            new SimpleDateTime(2021, 10, 3, 9, 45)),
                    new Entry("orange",
                            new SimpleDateTime(2021, 10, 3, 9, 40),
                            new SimpleDateTime(2021, 10, 3, 9, 55)),
                    new Entry("apple",
                            new SimpleDateTime(2021, 10, 2, 9, 0),
                            new SimpleDateTime(2021, 10, 2, 9, 30)),
                    new Entry("apple",
                            new SimpleDateTime(2021, 10, 1, 9, 0),
                            new SimpleDateTime(2021, 10, 1, 9, 30)),
                    new Entry("orange",
                            new SimpleDateTime(2021, 10, 1, 9, 30),
                            new SimpleDateTime(2021, 10, 1, 10, 0)),
                    new Entry("pear",
                            new SimpleDateTime(2021, 10, 1, 9, 30),
                            new SimpleDateTime(2021, 10, 1, 10, 0)),
                    new Entry("durian",
                            new SimpleDateTime(2021, 10, 1, 9, 25),
                            new SimpleDateTime(2021, 10, 1, 9, 35)),
                    new Entry("banana",
                            new SimpleDateTime(2021, 10, 1, 10, 58),
                            new SimpleDateTime(2021, 10, 1, 11, 0))
            );
            // 1 Oct
            // 9:00 apple
            // 9:25 apple, durian
            // 9:30 durian, orange, pear
            // 9:35 orange, pear
            // 10:00
            // 10:58  banana
            // 11:00
            System.out.println("Test 1");
            System.out.println("Expected:3");
            System.out.println("Actual  :" + getPeak(entries));
            System.out.println();
        }

        {
            List<Entry> entries = List.of(
                    new Entry("durian",
                            new SimpleDateTime(2021, 10, 3, 9, 15),
                            new SimpleDateTime(2021, 10, 3, 9, 45)),
                    new Entry("pear",
                            new SimpleDateTime(2021, 10, 3, 9, 0),
                            new SimpleDateTime(2021, 10, 3, 9, 45)),
                    new Entry("orange",
                            new SimpleDateTime(2021, 10, 3, 9, 44),
                            new SimpleDateTime(2021, 10, 3,9, 55)),
                    new Entry("guava",
                            new SimpleDateTime(2021, 10, 3, 9, 50),
                            new SimpleDateTime(2021, 10, 3,9, 59)),
                    new Entry("cherry",
                            new SimpleDateTime(2021, 10, 3, 9, 58),
                            new SimpleDateTime(2021, 10, 3,9, 59)),
                    new Entry("grape",
                            new SimpleDateTime(2021, 10, 3, 9, 57),
                            new SimpleDateTime(2021, 10, 3,10, 59)),
                    new Entry("apple",
                            new SimpleDateTime(2021, 10, 3, 1, 57),
                            new SimpleDateTime(2021, 10, 3,13, 59))
            );
            // 1:00  (apple)
            // 9:00  (apple pear)
            // 9:15  (apple, pear, durian)
            // 9:44  (apple, pear, durian, orange)
            // 9:45  (apple, orange)
            // 9:50  (apple, orange, guava)
            // 9:55  (apple, guava)
            // 9:57  (apple, guava, grape)
            // 9:58  (apple, guava, grape, cherry)
            // 9:59  (apple)
            //13:59  (apple)
            System.out.println("Test 2");
            System.out.println("Expected:4");
            System.out.println("Actual  :" + getPeak(entries));
            System.out.println();
        }
    }
}
