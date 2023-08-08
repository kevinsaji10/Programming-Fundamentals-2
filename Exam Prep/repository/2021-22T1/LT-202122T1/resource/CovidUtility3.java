import java.util.*;
public class CovidUtility3 {
        public static String[] getViolators(List<Employee> list, List<Entry> entryList) {
                List<String> unique = new ArrayList<>();
                for (Entry e: entryList) {
                        for (Employee emp : list) {
                                if (e.getEmployeeId().equals(emp.getEmployeeId()) && emp instanceof NonEssentialEmployee) {
                                        boolean isAllowed = false;
                                        NonEssentialEmployee ne = (NonEssentialEmployee)emp;
                                        int[] days = ne.getDaysOfWeek();
                                        if (days == null) {
                                                unique.add(emp.getEmployeeId());
                                        }
                                         else {
                                                for (int i : days) {
                                                        if (e.getStartDateTime().getDate().getDayOfWeek() == i) {
                                                                isAllowed = true;
                                                        }
                                                }
                                                if(!isAllowed) {
                                                        unique.add(emp.getEmployeeId());
                                                }
                                        }
                                        
                                }
                        }
                }
                Collections.sort(unique);
                return unique.toArray(new String[unique.size()]);
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
