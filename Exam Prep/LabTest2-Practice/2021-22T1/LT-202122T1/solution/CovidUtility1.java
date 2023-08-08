import java.util.*;

public class CovidUtility1 {
    public static SimpleDate[] getInOfficeDates(String target, List<Entry> entries) {
        if (entries == null || entries.isEmpty()) {
            throw new IllegalArgumentException("entries is null/empty");
        }
        Set<SimpleDate> result = new TreeSet<>();

        for (Entry e: entries) {
            if (e.getEmployeeId().equals(target)) {
                result.add(e.getStartDateTime().getDate());
            }
        }
        return result.toArray(new SimpleDate[0]);

    }


    public static void main(String[] args) {
        {
            List<Entry> entries = List.of(
                    new Entry("apple",
                            new SimpleDateTime(2020, 10, 1, 9, 0),
                            new SimpleDateTime(2020, 10, 1, 10, 0)),
                    new Entry("apple",
                            new SimpleDateTime(2020, 10, 1, 10, 0),
                            new SimpleDateTime(2020, 10, 1, 10, 30)),
                    new Entry("orange",
                            new SimpleDateTime(2021, 10, 5, 10, 0),
                            new SimpleDateTime(2021, 10, 5, 11, 0)),
                    new Entry("apple",
                            new SimpleDateTime(2021, 10, 3, 10, 0),
                            new SimpleDateTime(2021, 10, 3, 11, 0)),
                    new Entry("apple",
                            new SimpleDateTime(2021, 10, 2, 10, 0),
                            new SimpleDateTime(2021, 10, 2, 12, 0))
            );
            System.out.println("Test 1");
            System.out.println("Expected:[01/10/2020, 02/10/2021, 03/10/2021]");
            System.out.println("Actual  :" + Arrays.toString(getInOfficeDates("apple", entries)));
            System.out.println();
        }

        {
            List<Entry> entries = List.of(
                    new Entry("apple",
                            new SimpleDateTime(2021, 10, 1, 9, 0),
                            new SimpleDateTime(2021, 10, 1, 10, 0)),
                    new Entry("apple",
                            new SimpleDateTime(2021, 10, 1, 10, 0),
                            new SimpleDateTime(2021, 10, 1, 10, 30)),
                    new Entry("orange",
                            new SimpleDateTime(2021, 10, 5, 10, 0),
                            new SimpleDateTime(2021, 10, 5, 11, 0)),
                    new Entry("apple",
                            new SimpleDateTime(2021, 10, 3, 10, 0),
                            new SimpleDateTime(2021, 10, 3, 11, 0)),
                    new Entry("apple",
                            new SimpleDateTime(2021, 10, 2, 10, 0),
                            new SimpleDateTime(2021, 10, 2, 12, 0))
            );
            System.out.println("Test 2");
            System.out.println("Expected:[]");
            System.out.println("Actual  :" + Arrays.toString(getInOfficeDates("pear", entries)));
            System.out.println();
        }

        {
            System.out.println("Test 3");
            System.out.println("Expected:pass");
            try {
                Arrays.toString(getInOfficeDates("apple", null));
                System.out.println("Actual  :fail");
            } catch (IllegalArgumentException e) {
                if (e.getMessage().equals("entries is null/empty")) {
                    System.out.println("Actual  :pass");
                } else {
                    System.out.println("Actual  :fail");
                }
            }
            System.out.println("");
        }

        {
            System.out.println("Test 4");
            System.out.println("Expected:pass");
            try {
                Arrays.toString(getInOfficeDates("apple", new ArrayList<>()));
                System.out.println("Actual  :fail");
            } catch (IllegalArgumentException e) {
                if (e.getMessage().equals("entries is null/empty")) {
                    System.out.println("Actual  :pass");
                } else {
                    System.out.println("Actual  :fail");
                }
            }
            System.out.println();
        }
    }
}

