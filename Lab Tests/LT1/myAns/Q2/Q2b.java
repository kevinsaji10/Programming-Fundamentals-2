/*
 * Name: Kevin K Saji
 * Email ID: kevink.saji.2022@scis.smu.edu.sg
 */

import java.util.*;

public class Q2b {
    // ****************************************************
    // Follow the instructions below to test your methods.
    public static void main(String[] args) {
        List<School> schools = new ArrayList<>(List.of(
            new School(1),
            new School(2),
            new School(3)));
        
        int tcNum = 1;
        int year = 2024;
        String level = "P2";
        List<Student> answer = getStudents(schools, year, level);
        System.out.printf("Test %s: getStudents%n", tcNum++);
        System.out.println("Expected:[(Kelly, P2, 1/1/2024, Jason), (Zoe, P2, 1/1/2024, Jason)]");
        System.out.println("Actual  :" + answer);
        System.out.println();

        System.out.printf("Test %s: getStudents%n", tcNum++);
        List<Student> answer2 = getStudents(schools, 2023, null);
        System.out.println("Expected:[(Mary, P2, 1/1/2023, Betty), (Lionel, P2, 1/1/2023, David), (Sandy, P1, 1/1/2023, Betty), (Charlie, P2, 1/1/2023, Tony)]");
        System.out.println("Actual  :" + answer2);
        System.out.println();
        System.out.println();

    }

    /*
     * Write the method getStudents
     */
    public static ArrayList<Student> getStudents(List<School> schools, int yearJoined,
            String level) {
        // insert your code here.
        String year = "" + yearJoined;
        ArrayList<Student> finArr = new ArrayList<>();
        for (School sch : schools) {
            List<Student> stdList = sch.getStudents();
            for (Student std : stdList) {
                if(std.getLevel().equals(level)) {
                    finArr.add(std);
                }
            }
        }
        return finArr;
        // to make this code compile. Please modify accordingly!
    }

}
