/*
 *
 * Name:
 */
public class Utility2 {
    public static Map<String, List<University>> getListOfPartnerExchangeUniversities(List<Course> courseList) {
        return null;
    }

    public static void main(String[] args) {
        int idx = 1;
        {
            System.out.printf("Test %d%n", idx++);
            List<Course> courseList = List.of(
                    new ExchangeCourse("IS111", "202021T1", new University("Apple", "A")),
                    new ExchangeCourse("IS111", "202021T1", new University("Orangle", "A")),
                    new ExchangeCourse("CS111", "202021T1", new University("Apple", "C")),
                    new Course("IS111", "202021T1"),
                    new ExchangeCourse("CS111", "202021T1", new University("Apple", "C")),
                    new ExchangeCourse("CS111", "202021T1", new University("Pear", "B")),
                    new ExchangeCourse("CS112", "202021T1", new University("Pear", "B")),
                    new ExchangeCourse("CS1", "202021T1", new University("Banana", "B"))
                    );
            Map<String, List<University>> actual = getListOfPartnerExchangeUniversities(courseList);
            System.out.println("Result:{A=[Apple(A), Orangle(A)], B=[Pear(B), Banana(B)], C=[Apple(C)]}");
            System.out.println("Result:" + new TreeMap<>(actual));
            System.out.println();
        }

        {
            System.out.printf("Test %d%n", idx++);
            List<Course> courseList = List.of(
                    new Course("IS111", "202021T1"),
                    new Course("IS112", "202021T1")
                    );
            Map<String, List<University>> actual = getListOfPartnerExchangeUniversities(courseList);
            System.out.println("Result:{}");
            System.out.println("Result:" + new TreeMap<>(actual));
            System.out.println();
        }
    }
}
