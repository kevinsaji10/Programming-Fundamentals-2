/*
 * Name: Kevin K Saji
 * Email ID: kevink.saji.2022@scis.smu.edu.sg
 */

import java.util.*;

public class Q2a {

    // ****************************************************
    // Follow the instructions below to test your methods.
    public static void main(String[] args) {

        /* Creates the schools. */
        ArrayList<School> schools = new ArrayList<>();
        schools.add(new School("ABC School", 3));
        schools.add(new School("DEF School"));
        schools.add(new School("GHI School", 2));
        schools.add(new School("XYZ School", 5));

        /*
         * *******************************************************************
         * The following code tests the method enrol.
         */
        
        enrol("John", "P1", "1/1/2022", "Jason", schools);
        enrol("Mary", "P2", "1/1/2023", "Betty", schools);
        enrol("Kelly", "P2", "1/1/2024", "Jason", schools);
        enrol("Lionel", "P2", "1/1/2023", "David", schools);
        enrol("Sandy", "P1", "1/1/2023", "Betty", schools);
        enrol("Adrian", "P3", "1/1/2022", "Tony", schools);
        enrol("Zoe", "P2", "1/1/2024", "Jason", schools);
        enrol("Charlie", "P2", "1/1/2023", "Tony", schools);
        enrol("Francis", "P3", "1/1/2022", "Tony", schools);

        System.out.println();
        System.out.println("Expected:[ABC School: 3 students, DEF School: 0 students, GHI School: 2 students, XYZ School: 4 students]");
        System.out.println("Actual  :" + schools);
        System.out.println();
    }

    /*
     * Write the method enrol
     */
    public static void enrol(String name, String level, String dateJoined, String parent,
            ArrayList<School> schools) {
        // insert your code here.
            Person p = new Person(parent);
            Student s = new Student(name, level, dateJoined, p);
            for (School sch : schools) {
                if (sch.getNumOfVacancies() >=1) {
                    sch.enrol(s);
                }
            }
    }


}
