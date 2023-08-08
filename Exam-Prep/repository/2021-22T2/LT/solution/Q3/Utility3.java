import java.util.*;

public class Utility3 {
    public static List<String> getLOATerms(List<Course> cList) {

        List<String> myTerms = new ArrayList<>();

        for (Course c : cList) {
            String aTerm = c.getTerm();
            if (!myTerms.contains(aTerm)) {
                myTerms.add(aTerm);
            }
        }

        Collections.sort(myTerms);

        String firstTerm = myTerms.get(0);
        String lastTerm = myTerms.get(myTerms.size() - 1);
        List<String> allTerms = generateTerms(firstTerm, lastTerm);

        List<String> result = new ArrayList<>();
        for (String aTerm : allTerms) {
            if (!myTerms.contains(aTerm)) {
                result.add(aTerm);
            }
        }

        return result;
    }

    private static List<String> generateTerms(String start, String end) {
        int startYear = Integer.parseInt(start.substring(2, 6));
        String startTerm = start.substring(9);

        int endYear = Integer.parseInt(end.substring(2, 6));
        String endTerm = end.substring(9);

        if (startYear == endYear) {
            return List.of(start, end);
        }
        List<String> result = new ArrayList<>();
        if (startTerm.equals("2")) {
            result.add(start);
            startYear++;
        }
        if (endTerm.equals("1")) {
            endYear--;
        }

//        System.out.println(startYear + " " + endYear);
        for (int i = startYear; i <= endYear; i++) {
            String nextYear = ("" + (i + 1)).substring(2);

            String term1 = "AY" + i + nextYear + "T1";
            String term2 = "AY" + i + nextYear + "T2";

            result.add(term1);
            result.add(term2);
        }

        if (endTerm.equals("1")) {
            result.add(end);
        }
        return result;
    }

    public static void main(String[] args) {
//        System.out.println(generateTerms("AY202021T1", "AY202021T2"));
//        System.out.println(generateTerms("AY202021T1", "AY202122T1"));
//        System.out.println(generateTerms("AY202021T1", "AY202122T2"));
//        System.out.println(generateTerms("AY202021T1", "AY202223T1"));
//        System.out.println(generateTerms("AY202021T1", "AY202223T2"));
        int testNum = 1;
        {
            System.out.printf("Test %d%n", testNum++);
            List<Course> courseList = List.of(new Course("IS111", "AY202021T1"), new Course("IS113", "AY202021T2"), new Course("IS114", "AY202122T2"), new Course("IS115", "AY202122T1"));
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
            List<Course> courseList = List.of(new Course("IS111", "AY200001T2"), new Course("IS113", "AY200102T2"));
            List<String> actual = getLOATerms(courseList);
            System.out.println("Expected:[AY200102T1]");
            System.out.println("Actual  :" + actual);
            System.out.println();
        }


    }

}
