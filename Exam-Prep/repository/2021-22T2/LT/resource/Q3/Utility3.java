/*
 *
 * Name:
 */
public class Utility3 {
    public static List<String> getLOATerms(List<Course> cList) {
        return null;
        
    }

    public static void main(String[] args) {
        int testNum = 1;
        {
            System.out.printf("Test %d%n", testNum++);
            List<Course> courseList = List.of(
                    new Course("IS111", "AY202021T1"),
                    new Course("IS113", "AY202021T2"),
                    new Course("IS114", "AY202122T2"),
                    new Course("IS115", "AY202122T1"),
                    new ExchangeCourse("IS115", "AY202122T1", new University("UMS", "A")));
            List<String> actual = getLOATerms(courseList);
            System.out.println("Expected:[]");
            System.out.println("Actual  :" + actual);
            System.out.println();
        }

        {
            System.out.printf("Test %d%n", testNum++);
            List<Course> courseList = List.of(new Course("IS113", "AY202021T2"), new Course("IS114", "AY202122T2"), new Course("IS115", "AY202122T1"), new Course("IS111", "AY202021T1"));
            List<String> actual = getLOATerms(courseList);
            System.out.println("Expected:[]");
            System.out.println("Actual  :" + actual);
            System.out.println();
        }

        {
            System.out.printf("Test %d%n", testNum++);
            List<Course> courseList = List.of(new Course("IS111", "AY202021T1"), new Course("IS113", "AY202223T2"), new Course("IS114", "AY202122T2"), new Course("IS115", "AY202122T1"));
            List<String> actual = getLOATerms(courseList);
            System.out.println("Expected:[AY202021T2, AY202223T1]");
            System.out.println("Actual  :" + actual);
            System.out.println();
        }

        {
            System.out.printf("Test %d%n", testNum++);
            List<Course> courseList = List.of(new Course("IS111", "AY200001T1"), new Course("IS113", "AY200102T1"));
            List<String> actual = getLOATerms(courseList);
            System.out.println("Expected:[AY200001T2]");
            System.out.println("Actual  :" + actual);
            System.out.println();
        }

        {
            System.out.printf("Test %d%n", testNum++);
            List<Course> courseList = List.of(new Course("IS111", "AY200001T2"), new Course("IS113", "AY200001T1"));
            List<String> actual = getLOATerms(courseList);
            System.out.println("Expected:[]");
            System.out.println("Actual  :" + actual);
            System.out.println();
        }

        {
            System.out.printf("Test %d%n", testNum++);
            List<Course> courseList = List.of(new Course("IS111", "AY200001T2"), new Course("IS113", "AY200001T2"));
            List<String> actual = getLOATerms(courseList);
            System.out.println("Expected:[]");
            System.out.println("Actual  :" + actual);
            System.out.println();
        }

        {
            System.out.printf("Test %d%n", testNum++);
            List<Course> courseList = List.of(new Course("IS113", "AY200001T2"));
            List<String> actual = getLOATerms(courseList);
            System.out.println("Expected:[]");
            System.out.println("Result  :" + actual);
            System.out.println();
        }

        {
            System.out.printf("Test %d%n", testNum++);
            List<Course> courseList = List.of(
                    new Course("IS111", "AY200001T2"),
                    new Course("IS113", "AY200102T2"));
            List<String> actual = getLOATerms(courseList);
            System.out.println("Expected:[AY200102T1]");
            System.out.println("Actual  :" + actual);
            System.out.println();
        }
    }

}
