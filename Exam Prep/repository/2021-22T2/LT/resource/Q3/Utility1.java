/*
 *
 * Name:
 */
public class Utility1 {
    public static List<String> getCommonCourses(List<Course> courseList1, List<Course> courseList2) {

        return null;
    }

    public static void main(String[] args) {
        int idx = 1;
        {
            System.out.println("Test " + idx++);
            List<Course> courseList1 = List.of(
                    new Course("IS111", "202021T1"),
                    new Course("IS112", "202021T1"));
            List<Course> courseList2 = List.of(
                    new Course("IS101", "202021T1"),
                    new Course("IS102", "202021T1"));
            List<String> actual = getCommonCourses(courseList1, courseList2);
            System.out.println("Result:[]");
            System.out.println("Result:" + actual);
            System.out.println();
        }

        {
            System.out.println("Test " + idx++);
            List<Course> courseList1 = List.of(
                    new Course("IS111", "201112T1"),
                    new Course("IS112", "201112T1"));
            List<Course> courseList2 = List.of(
                    new Course("IS111", "202021T1"),
                    new Course("IS102", "202021T1"));
            List<String> actual = getCommonCourses(courseList1, courseList2);
            System.out.println("Result:[IS111]");
            System.out.println("Result:" + actual);
            System.out.println();
        }

        {
            System.out.println("Test " + idx++);
            List<Course> courseList1 = List.of(
                    new Course("IS112", "202021T2"),
                    new Course("IS111", "202021T1"));
            List<Course> courseList2 = List.of(
                    new Course("IS111", "202021T1"),
                    new Course("IS102", "202122T1"),
                    new Course("IS112", "202021T2"));
            List<String> actual = getCommonCourses(courseList1, courseList2);
            System.out.println("Result:[IS111, IS112]");
            System.out.println("Result:" + actual);
            System.out.println();
        }

        {
            System.out.println("Test " + idx++);
            List<Course> courseList1 = List.of(new Course("BIZ111", "202021T1"));
            List<Course> courseList2 = List.of(
                    new Course("IS111", "202021T1"),
                    new Course("IS102", "202122T1"),
                    new Course("IS112", "202021T2"));
            List<String> actual = getCommonCourses(courseList1, courseList2);
            System.out.println("Result:[]");
            System.out.println("Result:" + actual);
            System.out.println();
        }

        {
            System.out.println("Test " + idx++);
            List<Course> courseList1 = List.of(
                    new Course("IS111", "202021T1"),
                    new Course("IS102", "202122T1"),
                    new Course("IS112", "202021T2"));
            List<Course> courseList2 = List.of(
                    new Course("CS111", "202021T1"),
                    new Course("CS102", "202122T1"),
                    new Course("CS112", "202021T2")
            );
            List<String> actual = getCommonCourses(courseList1, courseList2);
            System.out.println("Result:[]");
            System.out.println("Result:" + actual);
            System.out.println();
        }

        {
            System.out.println("Test " + idx++);
            List<Course> courseList1 = List.of(new Course("IS111", "202021T1"), new Course("IS102", "202122T1"), new Course("IS112", "202021T2"));
            // the student failed IS111. thus repeating in term 2
            List<Course> courseList2 = List.of(new Course("IS111", "202021T2"), new Course("IS111", "202021T1"));
            List<String> actual = getCommonCourses(courseList1, courseList2);
            System.out.println("Result:[IS111]");
            System.out.println("Result:" + actual);
            System.out.println();
        }
    }
}
