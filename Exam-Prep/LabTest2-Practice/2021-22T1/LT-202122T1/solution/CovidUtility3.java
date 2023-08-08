import java.util.*;

public class CovidUtility3 {

    public static String[] getViolators(List<Employee> employeeList, List<Entry> entries) {
        Map<String,int[]> allowed = new HashMap<>();
        for (Employee e: employeeList) {
            if (e instanceof NonEssentialEmployee) {
                NonEssentialEmployee nonEssential = (NonEssentialEmployee)e;
                int[] allowedDays = nonEssential.getDaysOfWeek();
                if (allowedDays == null) {
                    allowedDays = new int[0];
                }
                Arrays.sort(allowedDays);
                allowed.put(e.getEmployeeId(), allowedDays);
            } else {
                allowed.put(e.getEmployeeId(), new int[]{1,2,3,4,5,6,7});
            }

        }
        Set<String> violators = new HashSet<>();
        for (Entry entry:entries) {
            int dayOfWeek = entry.getStartDateTime().getDayOfWeek();
            int[] allowedDays = allowed.get(entry.getEmployeeId());

            if (Arrays.binarySearch(allowedDays, dayOfWeek) < 0) {
                violators.add(entry.getEmployeeId());
            }
        }
        return violators.toArray(new String[violators.size()]);
    }

    public static void main(String[] args) {
        {

            List<Employee> employees = List.of(
                    new Employee("apple"),
                    new NonEssentialEmployee("papaya", new int[]{5}),
                    new NonEssentialEmployee("pear", null),
                    new NonEssentialEmployee("orange", new int[]{1, 3, 2}));

            List<Entry> entries = List.of(
                    new Entry("pear",
                            new SimpleDateTime(2021, 11, 4, 10, 0),
                            new SimpleDateTime(2021, 11, 4, 10, 1)
                    ),
                    new Entry("papaya",
                            new SimpleDateTime(2021, 11, 5, 10, 0),
                            new SimpleDateTime(2021, 11, 5, 11, 0)
                    ),
                    new Entry("papaya",
                            new SimpleDateTime(2021, 11, 12, 10, 0),
                            new SimpleDateTime(2021, 11, 12, 11, 0)
                    ),
                    new Entry("orange",
                            new SimpleDateTime(2021, 11, 1, 10, 0),
                            new SimpleDateTime(2021, 11, 1, 11, 0)
                    ),
                    new Entry("orange",
                            new SimpleDateTime(2021, 11, 2, 10, 0),
                            new SimpleDateTime(2021, 11, 2, 11, 0)
                    ),
                    new Entry("orange",
                            new SimpleDateTime(2021, 11, 3, 10, 0),
                            new SimpleDateTime(2021, 11, 3, 11, 0)
                    )
                    );
            System.out.println("Test 1");
            System.out.println("Expected:[pear]");
            System.out.println("Actual  :" + Arrays.toString(getViolators(employees, entries)));
            System.out.println();
        }

        {

            List<Employee> employees = List.of(
                    new Employee("apple"));

            List<Entry> entries = List.of(
                    new Entry("apple",
                            new SimpleDateTime(2021, 11, 5, 10, 0),
                            new SimpleDateTime(2021, 11, 5, 11, 0)
                    ),
                    new Entry("apple",
                            new SimpleDateTime(2021, 11, 6, 10, 0),
                            new SimpleDateTime(2021, 11, 6, 11, 0)
                    ),
                    new Entry("apple",
                            new SimpleDateTime(2021, 11, 7, 10, 0),
                            new SimpleDateTime(2021, 11, 7, 11, 0)
                    ),
                    new Entry("apple",
                            new SimpleDateTime(2021, 11, 1, 10, 0),
                            new SimpleDateTime(2021, 11, 1, 11, 0)
                    ),
                    new Entry("apple",
                            new SimpleDateTime(2021, 11, 4, 10, 0),
                            new SimpleDateTime(2021, 11, 4, 11, 0)
                    ),
                    new Entry("apple",
                            new SimpleDateTime(2021, 11, 3, 10, 0),
                            new SimpleDateTime(2021, 11, 3, 11, 0)
                    ),
                    new Entry("apple",
                            new SimpleDateTime(2021, 11, 2, 10, 0),
                            new SimpleDateTime(2021, 11, 2, 11, 0)
                    )
            );
            System.out.println("Test 2");
            System.out.println("Expected:[]");
            System.out.println("Actual  :" + Arrays.toString(getViolators(employees, entries)));
            System.out.println();
        }

        {

            List<Employee> employees = List.of(
                    new NonEssentialEmployee("apple", new int[]{5}),
                    new NonEssentialEmployee("berry", new int[]{3, 5}),
                    new NonEssentialEmployee("carrot", new int[]{1, 3, 2}));

            List<Entry> entries = List.of(
                    new Entry("apple",
                            new SimpleDateTime(2021, 11, 4, 10, 0),
                            new SimpleDateTime(2021, 11, 4, 10, 1)
                    ),
                    new Entry("berry",
                            new SimpleDateTime(2021, 11, 4, 10, 0),
                            new SimpleDateTime(2021, 11, 4, 11, 0)
                    ),
                    new Entry("carrot",
                            new SimpleDateTime(2021, 11, 4, 10, 0),
                            new SimpleDateTime(2021, 11, 4, 11, 0)
                    )
            );
            System.out.println("Test 3");
            System.out.println("Expected:[apple, berry, carrot]");
            System.out.println("Actual  :" + Arrays.toString(getViolators(employees, entries)));
            System.out.println();
        }
    }
}