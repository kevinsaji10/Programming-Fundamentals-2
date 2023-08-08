import java.util.*;

public class CovidUtility4 {
        public static String[] getCloseContacts(String target, List<Entry> list) {
                Map<String, Long> map = new HashMap<>();
                List<Entry> targetEntries = new ArrayList<>();
                // get target emp
                for (Entry e : list) {
                        if (e.getEmployeeId().equals(target)) {
                                targetEntries.add(e);
                        }
                }
                System.out.println(targetEntries);
                for (Entry targetEnt : targetEntries) {
                        for (Entry e : list) {
                                if (e.overlap(targetEnt) && !(e.getEmployeeId().equals(target))) {
                                        SimpleDateTime oStart = null;
                                        SimpleDateTime oEnd = null;
                                        if (e.getStartDateTime().isAfter(targetEnt.getStartDateTime())) {
                                                oStart = e.getStartDateTime();
                                        } else {
                                                oStart = targetEnt.getStartDateTime();
                                        }
                                        if (e.getEndDateTime().isBefore(targetEnt.getEndDateTime())) {
                                                oEnd = e.getEndDateTime();
                                        } else {
                                                oEnd = targetEnt.getEndDateTime();
                                        }
                                        long overlap = oStart.until(oEnd);
                                        if (!map.containsKey(e.getEmployeeId())) {
                                                map.put(e.getEmployeeId(), overlap);
                                        } else {
                                        long old = map.get(e.getEmployeeId());
                                        map.replace(e.getEmployeeId(), old + overlap);
                                        }
                                }
                                System.out.println(map);
                        }
                }
                List<String> l1 = new ArrayList<>();
                System.out.println(map);
                for (String s : map.keySet()) {
                        if (map.get(s) >= 15) {
                                l1.add(s);
                        }
                }
                return l1.toArray(new String[l1.size()]);

        }

        public static void main(String[] args) {
                {
                        List<Entry> entries = List.of(
                                        new Entry("apple",
                                                        new SimpleDateTime(2021, 11, 1, 10, 0),
                                                        new SimpleDateTime(2021, 11, 1, 11, 0)),
                                        new Entry("apple",
                                                        new SimpleDateTime(2021, 11, 2, 11, 10),
                                                        new SimpleDateTime(2021, 11, 2, 12, 0)),
                                        new Entry("pear",
                                                        new SimpleDateTime(2021, 11, 3, 9, 30),
                                                        new SimpleDateTime(2021, 11, 3, 10, 5)),
                                        new Entry("orange",
                                                        new SimpleDateTime(2021, 11, 1, 10, 30),
                                                        new SimpleDateTime(2021, 11, 1, 10, 40)),
                                        new Entry("orange",
                                                        new SimpleDateTime(2021, 11, 1, 10, 55),
                                                        new SimpleDateTime(2021, 11, 1, 11, 55)));
                        System.out.println("Test 1");
                        System.out.println("Expected:[orange]");
                        // Orange (Total: 15 minutes)
                        // 1. 10 minutes(10:30 - 10:40)
                        // 2. 5 minutes (10:55 - 11:00)
                        System.out.println("Actual  :" + Arrays.toString(getCloseContacts("apple", entries)));
                        System.out.println();
                }

                {
                        List<Entry> entries = List.of(
                                        new Entry("durian",
                                                        new SimpleDateTime(2021, 11, 1, 10, 0),
                                                        new SimpleDateTime(2021, 11, 1, 11, 0)),
                                        new Entry("apple",
                                                        new SimpleDateTime(2021, 11, 2, 10, 46),
                                                        new SimpleDateTime(2021, 11, 2, 12, 0)));
                        System.out.println("Test 2");
                        System.out.println("Expected:[]");
                        System.out.println("Actual  :" + Arrays.toString(getCloseContacts("apple", entries)));
                        System.out.println();
                }

                {
                        List<Entry> entries = List.of(
                                        new Entry("durian",
                                                        new SimpleDateTime(2021, 11, 1, 10, 0),
                                                        new SimpleDateTime(2021, 11, 1, 11, 0)),
                                        new Entry("apple",
                                                        new SimpleDateTime(2021, 11, 1, 10, 46),
                                                        new SimpleDateTime(2021, 11, 1, 12, 0)),
                                        new Entry("durian",
                                                        new SimpleDateTime(2021, 11, 2, 10, 0),
                                                        new SimpleDateTime(2021, 11, 2, 11, 0)),
                                        new Entry("apple",
                                                        new SimpleDateTime(2021, 11, 2, 10, 46),
                                                        new SimpleDateTime(2021, 11, 2, 12, 0)));
                        System.out.println("Test 2");
                        System.out.println("Expected:[]");
                        System.out.println("Actual  :" + Arrays.toString(getCloseContacts("apple", entries)));
                        System.out.println();
                }

                {
                        List<Entry> entries = List.of(
                                        new Entry("durian",
                                                        new SimpleDateTime(2021, 11, 1, 10, 0),
                                                        new SimpleDateTime(2021, 11, 1, 11, 0)),
                                        new Entry("durian",
                                                        new SimpleDateTime(2021, 11, 1, 14, 0),
                                                        new SimpleDateTime(2021, 11, 1, 15, 0)),
                                        new Entry("durian",
                                                        new SimpleDateTime(2021, 11, 2, 10, 0),
                                                        new SimpleDateTime(2021, 11, 2, 11, 0)),
                                        new Entry("orange",
                                                        new SimpleDateTime(2021, 11, 1, 10, 55),
                                                        new SimpleDateTime(2021, 11, 1, 11, 0)),
                                        new Entry("orange",
                                                        new SimpleDateTime(2021, 11, 1, 12, 00),
                                                        new SimpleDateTime(2021, 11, 1, 14, 10)),
                                        new Entry("pear",
                                                        new SimpleDateTime(2021, 11, 1, 10, 55),
                                                        new SimpleDateTime(2021, 11, 1, 11, 0)),
                                        new Entry("pear",
                                                        new SimpleDateTime(2021, 11, 2, 10, 46),
                                                        new SimpleDateTime(2021, 11, 2, 14, 10)));
                        System.out.println("Test 3");
                        System.out.println("Expected:[orange]");
                        // orange (total: 15 minutes)
                        // 5 minutes (10:55 - 11:00)
                        // 10 minutes (14:00 - 14:10)
                        // pear spent 14 minutes (1 Nov) and 5 minutes (2 Nov) .. so not a close contact
                        System.out.println("Actual  :" + Arrays.toString(getCloseContacts("durian", entries)));
                        System.out.println();
                }
        }
}