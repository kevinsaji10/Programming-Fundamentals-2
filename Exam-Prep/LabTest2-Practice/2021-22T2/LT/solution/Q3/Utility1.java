import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Utility1 {
    public static List<String> getCommonCourses(List<Course> courseList1, List<Course> courseList2) {
        List<String> result = new ArrayList<>();
        for (Course c1 : courseList1) {
            for (Course c2: courseList2) {
                if (c1.getCode().equals(c2.getCode())) {
                    if (!result.contains(c1.getCode())) {
                        result.add(c1.getCode());
                    }
                }
            }
        }
        Collections.sort(result);
        return result;
    }

    public static void main(String[] args) {
        {
            System.out.println("Test 1");
            List<Course> courseList1 = List.of(new Course("IS111", "202021T1"), new Course("IS112", "202021T1"));
            List<Course> courseList2 = List.of(new Course("IS101", "202021T1"), new Course("IS102", "202021T1"));
            List<String> actual = getCommonCourses(courseList1, courseList2);
            System.out.println("Result:[]");
            System.out.println("Result:" + actual);
            System.out.println();
        }

        {
            System.out.println("Test 2");
            List<Course> courseList1 = List.of(new Course("IS111", "201112T1"), new Course("IS112", "201112T1"));
            List<Course> courseList2 = List.of(new Course("IS111", "202021T1"), new Course("IS102", "202021T1"));
            List<String> actual = getCommonCourses(courseList1, courseList2);
            System.out.println("Result:[IS111]");
            System.out.println("Result:" + actual);
            System.out.println();
        }

        {
            System.out.println("Test 3");
            List<Course> courseList1 = List.of(new Course("IS112", "202021T2"), new Course("IS111", "202021T1"));
            List<Course> courseList2 = List.of(new Course("IS111", "202021T1"), new Course("IS102", "202122T1"), new Course("IS112", "202021T2"));
            List<String> actual = getCommonCourses(courseList1, courseList2);
            System.out.println("Result:[IS111, IS112]");
            System.out.println("Result:" + actual);
            System.out.println();
        }

        {
            System.out.println("Test 4");
            List<Course> courseList1 = List.of();
            List<Course> courseList2 = List.of(new Course("IS111", "202021T1"), new Course("IS102", "202122T1"), new Course("IS112", "202021T2"));
            List<String> actual = getCommonCourses(courseList1, courseList2);
            System.out.println("Result:[]");
            System.out.println("Result:" + actual);
            System.out.println();
        }

        {
            System.out.println("Test 5");
            List<Course> courseList1 = List.of(new Course("IS111", "202021T1"), new Course("IS102", "202122T1"), new Course("IS112", "202021T2"));
            List<Course> courseList2 = List.of();
            List<String> actual = getCommonCourses(courseList1, courseList2);
            System.out.println("Result:[]");
            System.out.println("Result:" + actual);
            System.out.println();
        }

        {
            System.out.println("Test 5");
            List<Course> courseList1 = List.of(new Course("IS111", "202021T1"), new Course("IS102", "202122T1"), new Course("IS112", "202021T2"));
            // the student failed IS111. thus repeating in term 2
            List<Course> courseList2 = List.of(new Course("IS111", "202021T1"), new Course("IS111", "202021T2"));
            List<String> actual = getCommonCourses(courseList1, courseList2);
            System.out.println("Result:[IS111]");
            System.out.println("Result:" + actual);
            System.out.println();
        }

    }
}
