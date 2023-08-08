
/*
 *
 * Name:
 */
import java.util.*;

// split each course attribute into the format and assign to variables
// create a function to generate the next term
// if the next term is not contained in the list, add to output list
public class Utility3 {
    // function to generate the next term (assuming non LOA)
    public static String getNextTerm(String currentTerm) {
        String ay = currentTerm.substring(0, 2);
        String startYear = currentTerm.substring(2, 6);
        String endYear = currentTerm.substring(6, 8);
        String term = currentTerm.substring(8);
        if (term.equals("T1")) {
            term = "T2";
        } else {
            term = "T1";
            startYear = "" + (Integer.parseInt(startYear) + 1);
            if (Integer.parseInt(endYear) < 9) {
                endYear = "0" + (Integer.parseInt(endYear) + 1);
            } else {
                endYear = "" + (Integer.parseInt(endYear) + 1);
            }
        }
        return ay + startYear + endYear + term;
    }

    public static List<String> getLOATerms(List<Course> cList) {
        List<String> test = new ArrayList<>();
        // create test list containing all the terms that the student takes courses in
        for (Course c : cList) {
            test.add(c.getTerm());
        }
        // sort the test list in ascending order so that it can be compared
        Collections.sort(test);
        List<String> retList = new ArrayList<>();
        // get the first term in the test list and assign to current term
        String currentTerm = test.get(0);
        int index = 0;
        // keep generating the next term from current term and compare it to the terms
        // in the list.
        // if the terms do not match, it means that its LOA. increase index if the terms
        // match. generate
        // next term regardless of match
        while (!currentTerm.equals(test.get(test.size() - 1))) {
            if (!(currentTerm.equals(test.get(index)))) {
                retList.add(currentTerm);
            } else {
                index++;
            }
            currentTerm = getNextTerm(currentTerm);
        }
        return retList;
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
            List<Course> courseList = List.of(new Course("IS113", "AY202021T2"), new Course("IS114", "AY202122T2"),
                    new Course("IS115", "AY202122T1"), new Course("IS111", "AY202021T1"));
            List<String> actual = getLOATerms(courseList);
            System.out.println("Expected:[]");
            System.out.println("Actual  :" + actual);
            System.out.println();
        }

        {
            System.out.printf("Test %d%n", testNum++);
            List<Course> courseList = List.of(new Course("IS111", "AY202021T1"), new Course("IS113", "AY202223T2"),
                    new Course("IS114", "AY202122T2"), new Course("IS115", "AY202122T1"));
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

// public static String nextTerm(String currentTerm) {
// // term
// String term = currentTerm.substring(8);
// // 4 digit year
// String year1 = currentTerm.substring(2, 6);
// // 2 digit year
// String year2 = currentTerm.substring(6, 8);
// String prefix = "AY";
// if (term.equals("T2")) {
// year1 = "" + (Integer.parseInt(year1) + 1);
// // if year2 begins with 0
// if (Integer.parseInt(year2) <9) {
// year2 = "" + "0" + (Integer.parseInt(year2) + 1);
// } else {
// year2 = "" + (Integer.parseInt(year2) + 1);
// }
// term = "T1";
// } else {
// term = "T2";
// }
// return prefix + year1 + year2 + term;
// }

// public static List<String> getLOATerms(List<Course> cList) {
// List<String> list = new ArrayList<>();
// // add each term to arrayList
// for (Course c : cList) {
// String term = c.getTerm();
// if (!list.contains(term)) {
// list.add(term);
// }
// }
// // sort the arrayList
// Collections.sort(list);
// // create new arrayList to store return values
// List<String> loaList = new ArrayList<>();
// boolean isNotEnd = true;
// String currentTerm = list.get(0);
// while (!nextTerm(currentTerm).equals(list.get(list.size() - 1))) {
// String nextTerm = nextTerm(currentTerm);
// // check if next term is in the list of terms, if not means it is LOA
// if (!list.contains(nextTerm)) {
// loaList.add(nextTerm);
// }
// // reassign current term to next term
// currentTerm = nextTerm;
// }
// return loaList;
// }