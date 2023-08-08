/*
 *
 * Name:
 */
public class Utility4 {

    public static List<String> getCoursesTakenInSameYearAndSemesterOfStudy(List<Course> courseList1, List<Course> courseList2) {
    
        return null;
    }
    public static void main(String[] args) {
        {
            System.out.println("Test 1");
            List<Course> courseList1 = List.of(new Course("IS111", "AY202021T1"), new Course("IS112", "AY202021T2"));
            List<Course> courseList2 = List.of(new Course("IS111", "AY202122T1"), new Course("IS112", "AY202122T2"));
            List<String> actual = getCoursesTakenInSameYearAndSemesterOfStudy(courseList1, courseList2);
            System.out.println("Result:[IS111, IS112]");
            Collections.sort(actual);
            System.out.println("Result:" + actual);
            System.out.println();
        }

        {
            System.out.println("Test 2");
            List<Course> courseList1 = List.of(
                    new ExchangeCourse("CS1", "AY202122T1", new University("apple", "A")),
                    new Course("IS114", "AY202021T2"),
                    new Course("IS113", "AY202122T2"),
                    new Course("IS111", "AY202021T1"));
            List<Course> courseList2 = List.of(
                    new Course("IS111", "AY202122T2"),
                    new ExchangeCourse("CS1", "AY202223T2", new University("apple", "A")),
                    new Course("IS112", "AY202223T1"));
            List<String> actual = getCoursesTakenInSameYearAndSemesterOfStudy(courseList1, courseList2);
            System.out.println("Result:[CS1, IS111]");
            System.out.println("Result:" + actual);
            System.out.println();
        }
        
        {
            System.out.println("Test 3");
            List<Course> courseList1 = List.of(
                    new Course("IS111", "AY202021T1"),
                    new Course("IS113", "AY202122T1"),
                    new Course("IS114", "AY202122T2"),
                    new Course("IS112", "AY202021T2"));
            List<Course> courseList2 = List.of(
                    new Course("IS114", "AY202122T1"),
                    new Course("IS111", "AY202021T2"),
                    new Course("IS112", "AY202021T2"),
                    new Course("IS113", "AY202122T2"));
            List<String> actual = getCoursesTakenInSameYearAndSemesterOfStudy(courseList1, courseList2);
            System.out.println("Result:[IS111, IS113]");
            System.out.println("Result:" + actual);
            System.out.println();
        }
    }

}
