import java.util.*;
import java.io.*;

public class App {

    private static void testMissingFile() {
        String filename = "testdata0.txt";
        System.out.println("*** Test File : \"" + filename + "\" ***");

        try {
            Map<String, List<Person>> vaccineCentres = Utility.load(filename);
            System.out.println("  Actual : No exception caught");
            System.out.println("  Result : Fail.  ");
        } catch (InvalidInfoException e) {
            System.out.println(" Actual : " + "Exception caught - " + e.getMessage());
            System.out.println(" Result : Passed. ");
        } catch (Throwable ex) {
            System.out.println("  Result : Fail.");
            ex.printStackTrace();
        }
        System.out.println();
    }

    private static void testInvalidFile() {
        String filename = "testdata2.txt";
        System.out.println("*** Test File : \"" + filename + "\" ***");

        try {
            Map<String, List<Person>> vaccineCentres = Utility.load(filename);
            System.out.println(" Actual : No exception caught");
            System.out.println(" Result : Fail. ");
        } catch (InvalidInfoException e) {
            System.out.println(" Actual : " + "Exception caught - " + e.getMessage());
            System.out.println(" Result : Passed. ");
        } catch (Throwable ex) {
            System.out.println("Result: Fail.");
            ex.printStackTrace();
        }
        System.out.println();
    }

    private static void testValidFile() {
        String filename = "testdata1.txt";

        System.out.println("*** Test File : \"" + filename + "\" ***");

        try {
            Map<String, List<Person>> vaccineCentres = Utility.load(filename);
        
            if (vaccineCentres == null) {
                System.out.println("  Actual : No vaccineCentres loaded");
                System.out.println("  Result : Fail");
                System.out.println();
            } else {
                System.out.println("  Actual : " + vaccineCentres.size() + " vaccineCentres loaded");
                if (vaccineCentres.size() == 3) {
                    System.out.println("  Result : Passed");
                } else {
                    System.out.println("  Result : Fail");
                }
                System.out.println();

                for (Map.Entry<String, List<Person>> entry : vaccineCentres.entrySet()) {
                    System.out.println("----------------------------------------------------------------------");
                    List<Person> persons = entry.getValue();
                    System.out.println("Vaccine Centre : " + entry.getKey() + " (" + persons.size() + " persons)");
                    for (Person p : persons) {
                        System.out.println(p);
                    }
                }
            }
        } catch (Throwable ex) {
            System.out.println("  Result : Fail");
            ex.printStackTrace();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        testMissingFile();
        testInvalidFile();
        testValidFile();
    }
}