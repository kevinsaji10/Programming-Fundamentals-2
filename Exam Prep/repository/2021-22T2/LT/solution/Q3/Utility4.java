import java.util.*;

public class Utility4 {


    private static Map<String, Integer> generateTerms(String start, String end) {
        int startYear = Integer.parseInt(start.substring(2, 6));
        String startTerm = start.substring(9);

        int endYear = Integer.parseInt(end.substring(2, 6));
        String endTerm = end.substring(9);

        if (startYear == endYear) {
            return Map.of(start, 1,end, 2);
        }
        Map<String, Integer> result = new HashMap<>();
        int termCount = 1;
        if (startTerm.equals("2")) {
            result.put(start, termCount++);
            startYear++;
        }
        if (endTerm.equals("1")) {
            endYear--;
        }

        for (int i = startYear; i <= endYear; i++) {
            String nextYear = ("" + (i + 1)).substring(2);

            String term1 = "AY" + i + nextYear + "T1";
            String term2 = "AY" + i + nextYear + "T2";

            result.put(term1, termCount++);
            result.put(term2, termCount++);
        }

        if (endTerm.equals("1")) {
            result.put(end, termCount);
        }
        return result;
    }

    private static Map<Integer, List<Course>> getTermCourseMapping(List<Course> courseList) {

        Map<Integer, List<Course>> result = new HashMap<>();

        List<String> terms = getTerms(courseList);
        String firstTerm = terms.get(0);
        String lastTerm = terms.get(terms.size() - 1);
        Map<String, Integer> termMapping = generateTerms(firstTerm, lastTerm);

        System.out.println(termMapping);
        for (Course c : courseList) {
            String aTerm = c.getTerm();
            List<Course> termCourses = result.get(termMapping.get(aTerm));

            if (termCourses == null) {
                termCourses = new ArrayList<>();
                result.put(termMapping.get(aTerm), termCourses);
            }
            termCourses.add(c);
        }
        return result;
    }

    private static List<String> getTerms(List<Course> courseList) {
        List<String> terms = new ArrayList<>();

        for (Course c : courseList) {
            String aTerm = c.getTerm();

            // finding unique terms
            if (!terms.contains(aTerm)) {
                terms.add(aTerm);
            }
        }
        Collections.sort(terms);
        return terms;
    }


    public static List<String> getCoursesTakenInSameTermOfStudy(List<Course> courseList1, List<Course> courseList2) {
        Map<Integer, List<Course>> termCourseMap1 = getTermCourseMapping(courseList1);
        Map<Integer, List<Course>> termCourseMap2 = getTermCourseMapping(courseList2);


        List<String> result = new ArrayList<>();
        for (Integer term : termCourseMap1.keySet()) {
            List<Course> termCourses2 = termCourseMap2.get(term);
            if (termCourses2 == null) {
                continue;
            }

            List<Course> termCourses1 = termCourseMap1.get(term);
            for (Course c1 : termCourses1) {
                for (Course c2 : termCourses2) {
                    if (c1.getCode().equals(c2.getCode())) {
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
            List<Course> courseList1 = List.of(new Course("IS111", "AY202021T1"), new Course("IS112", "AY202021T2"));
            List<Course> courseList2 = List.of(new Course("IS111", "AY202122T1"), new Course("IS112", "AY202122T2"));
            List<String> actual = getCoursesTakenInSameTermOfStudy(courseList1, courseList2);
            System.out.println("Result:[IS111, IS112]");
            Collections.sort(actual);
            System.out.println("Result:" + actual);
            System.out.println();
        }

        {
            System.out.println("Test 2");
            List<Course> courseList1 = List.of(new Course("IS114", "AY202021T2"), new Course("IS113", "AY202122T1"), new Course("IS111", "AY202021T1"));
            List<Course> courseList2 = List.of(new Course("IS111", "AY202122T2"), new Course("IS112", "AY202223T1"));
            List<String> actual = getCoursesTakenInSameTermOfStudy(courseList1, courseList2);
            System.out.println("Result:[IS111]");
            System.out.println("Result:" + actual);
            System.out.println();
        }

    }

}
